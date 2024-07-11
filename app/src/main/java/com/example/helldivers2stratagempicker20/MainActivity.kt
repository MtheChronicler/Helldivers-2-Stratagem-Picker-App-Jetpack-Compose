package com.example.helldivers2stratagempicker20

import android.os.Bundle
import android.widget.RadioGroup
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.helldivers2stratagempicker20.ui.theme.Helldivers2StratagemPicker20Theme
import com.example.helldivers2stratagempicker20.Stratagem
import com.example.helldivers2stratagempicker20.stratagemList
import kotlinx.coroutines.selects.select

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Helldivers2StratagemPicker20Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    var selectedEnemies by remember { mutableStateOf(value = "any") }
                    var selectedStratagem0 by remember {mutableStateOf(value = stratagemList.size)}
                    var selectedStratagem1 by remember {mutableStateOf(value = stratagemList.size)}
                    var selectedStratagem2 by remember {mutableStateOf(value = stratagemList.size)}
                    var selectedStratagem3 by remember {mutableStateOf(value = stratagemList.size)}

                    val selectEnemies: (String) -> Unit = {x -> selectedEnemies = x}

                    val selectStratagems: () -> Unit = {
                        var temp = pickRandom(enemies = selectedEnemies)
                        selectedStratagem0 = stratagemList.indexOf(temp[0])
                        selectedStratagem1 = stratagemList.indexOf(temp[1])
                        selectedStratagem2 = stratagemList.indexOf(temp[2])
                        selectedStratagem3 = stratagemList.indexOf(temp[3])
                    }

                    Column() {
                        enemySelectionPanel(selectedEnemies = selectedEnemies,
                            onRadioClick = selectEnemies,
                            onButtonClick = selectStratagems)
                        selectedStratagemsPanel(selectedStratagems = listOf(
                            selectedStratagem0,
                            selectedStratagem1,
                            selectedStratagem2,
                            selectedStratagem3
                        ))
                    }
                }
            }
        }
    }

    @Composable
    fun enemySelectionPanel(selectedEnemies: String,
                            onRadioClick: (String) -> Unit,
                            onButtonClick: () -> Unit, ){
        Column(modifier = Modifier
            .wrapContentHeight()
            .padding(top = 20.dp)) {
            radioButtonWithText(text = stringResource(id = R.string.any_enemy_string),
                isSelected = (selectedEnemies=="any"),
                onClick = {onRadioClick("any")})
            radioButtonWithText(text = stringResource(id = R.string.automatons_string),
                isSelected = (selectedEnemies=="automatons"),
                onClick = {onRadioClick("automatons")})
            radioButtonWithText(text = stringResource(id = R.string.terminids_string),
                isSelected = (selectedEnemies=="terminids"),
                onClick = {onRadioClick("terminids")})
            Button(onClick = onButtonClick, modifier = Modifier.fillMaxWidth()) {
                Text("Pick random stratagems", fontSize = 24.sp, textAlign = TextAlign.Center)
            }
        }
    }
    
    @Composable
    fun selectedStratagemsPanel(selectedStratagems: List<Int>){
        Column(modifier = Modifier
            .wrapContentHeight()
            .padding(top = 10.dp)) {
            singleSelectedStratagem(selectedStratagemIndex = selectedStratagems[0])
            singleSelectedStratagem(selectedStratagemIndex = selectedStratagems[1])
            singleSelectedStratagem(selectedStratagemIndex = selectedStratagems[2])
            singleSelectedStratagem(selectedStratagemIndex = selectedStratagems[3])
        }
    }
    
    @Composable
    fun singleSelectedStratagem(selectedStratagemIndex: Int){
        if(!(selectedStratagemIndex>= stratagemList.size)){
            var selectedStratagem = stratagemList[selectedStratagemIndex]
            Row(modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(all = 5.dp),
                horizontalArrangement = Arrangement.spacedBy(space = 10.dp, alignment = Alignment.Start),
                verticalAlignment = Alignment.CenterVertically){
                Image(painter = painterResource(id = selectedStratagem.iconId), contentDescription = "Stratagem icon",
                    modifier = Modifier.background(color = Color.Black)
                        .clip(shape = RoundedCornerShape(20.dp))
                        .size(50.dp)
                        .padding(all = 5.dp))
                Text(text = getString(selectedStratagem.displayNameID),
                    fontSize = 26.sp,
                    textAlign = TextAlign.Left)
            }
        }
    }
}

@Composable
fun radioButtonWithText(text: String, isSelected: Boolean, onClick: () -> Unit){
    Row(modifier = Modifier.height(height = 50.dp)) {
        RadioButton(selected = isSelected, onClick = onClick)
        Text(text = text, fontSize = 24.sp,
            modifier = Modifier
                .padding(top = 5.dp)
                .clickable(onClick = onClick))
    }
}

fun pickRandom(enemies: String): List<Stratagem>{
    var tempStratagemList: MutableList<Stratagem> = mutableListOf()
    var tempStratagem1: Stratagem
    var tempStratagem2: Stratagem

    do {
        tempStratagem1 = stratagemList.random()
        tempStratagem2 = stratagemList.random()
    } while ( tempStratagem1.typ != "orbital"
        || tempStratagem1.enemy !in listOf("any",enemies)
        || tempStratagem2.typ != "eagle"
        || tempStratagem2.enemy !in listOf("any",enemies)
        || ("smoke" in tempStratagem1.tags && "smoke" in tempStratagem2.tags) )
    tempStratagemList.add(tempStratagem1)
    tempStratagemList.add(tempStratagem2)

    do {
        tempStratagem1 = stratagemList.random()
        tempStratagem2 = stratagemList.random()
    } while ( tempStratagem1.typ != "weapon"
        || tempStratagem1.enemy !in listOf("any",enemies)
        || tempStratagem2.typ in listOf("orbital", "eagle", "weapon")
        || tempStratagem2.enemy !in listOf("any",enemies)
        || ("backpack" in tempStratagem1.tags && tempStratagem2.typ == "backpack" ))
    tempStratagemList.add(tempStratagem1)
    tempStratagemList.add(tempStratagem2)

    return tempStratagemList
}