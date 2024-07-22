package com.example.helldivers2stratagempicker20

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.helldivers2stratagempicker20.ui.theme.Helldivers2StratagemPicker20Theme
import kotlin.random.Random

@Composable
fun HomeScreen(navController: NavHostController, stratTypes: List<String>) {
    Helldivers2StratagemPicker20Theme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            var selectedEnemies by remember { mutableStateOf(value = "any") }
            var selectedStratagem0 by remember { mutableStateOf(value = stratagemList.size) }
            var selectedStratagem1 by remember { mutableStateOf(value = stratagemList.size) }
            var selectedStratagem2 by remember { mutableStateOf(value = stratagemList.size) }
            var selectedStratagem3 by remember { mutableStateOf(value = stratagemList.size) }
            var allowBackpackDoubling by remember { mutableStateOf(value = false) }

            val selectEnemies: (String) -> Unit = {x -> selectedEnemies = x}
            val changeAllowBackpackDoubling: (Boolean) -> Unit = {x -> allowBackpackDoubling = x}

            val selectStratagems: () -> Unit = {

                var temp = pickRandom(enemies = selectedEnemies,
                    stratTypes = stratTypes,
                    allowBackpackDoubling = allowBackpackDoubling)
                selectedStratagem0 = temp[0]
                selectedStratagem1 = temp[1]
                selectedStratagem2 = temp[2]
                selectedStratagem3 = temp[3]
            }

            Column(modifier = Modifier.padding(top = 25.dp)) {
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()){
                    Button(onClick = {navController.navigate(StratTypesScreen.route)}, modifier = Modifier.fillMaxWidth(0.5f)) {
                        Text(text = "Types selection")
                    }
                    Button(onClick = {navController.navigate(StratListScreen.route)}, modifier = Modifier.fillMaxWidth()) {
                        Text(text = "Stratagem list")
                    }
                }
                enemySelectionPanel(selectedEnemies = selectedEnemies,
                    allowBackpackDoubling = allowBackpackDoubling,
                    onRadioClick = selectEnemies,
                    onButtonClick = selectStratagems,
                    onCheckboxChange = changeAllowBackpackDoubling
                    )
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

@Composable
fun enemySelectionPanel(selectedEnemies: String,
                        allowBackpackDoubling: Boolean,
                        onRadioClick: (String) -> Unit,
                        onButtonClick: () -> Unit,
                        onCheckboxChange: (Boolean) -> Unit){
    Column(modifier = Modifier
        .wrapContentHeight()
        .padding(top = 5.dp)) {
        radioButtonWithText(text = stringResource(id = R.string.any_enemy_string),
            isSelected = (selectedEnemies=="any"),
            onClick = {onRadioClick("any")})
        radioButtonWithText(text = stringResource(id = R.string.automatons_string),
            isSelected = (selectedEnemies=="automatons"),
            onClick = {onRadioClick("automatons")})
        radioButtonWithText(text = stringResource(id = R.string.terminids_string),
            isSelected = (selectedEnemies=="terminids"),
            onClick = {onRadioClick("terminids")})
        Row(verticalAlignment = Alignment.CenterVertically){
            Checkbox(checked = allowBackpackDoubling, onCheckedChange = {onCheckboxChange(!allowBackpackDoubling)})
            Text(text = "Allow multiple stratagems requiring a backpack")
        }
        Button(onClick = onButtonClick, modifier = Modifier.fillMaxWidth()) {
            Text("Pick random stratagems", fontSize = 24.sp, textAlign = TextAlign.Center, fontWeight = FontWeight.Bold)
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
fun radioButtonWithText(text: String, isSelected: Boolean, onClick: () -> Unit, fontSize: Int = 24){
    Row(modifier = Modifier.height(height = (2*fontSize).dp)) {
        RadioButton(selected = isSelected, onClick = onClick)
        Text(text = text, fontSize = fontSize.sp,
            modifier = Modifier
                .padding(top = 5.dp)
                .clickable(onClick = onClick))
    }
}

@Composable
fun singleSelectedStratagem(selectedStratagemIndex: Int){
    if(selectedStratagemIndex < stratagemList.size){
        val selectedStratagem = stratagemList[selectedStratagemIndex]
        Row(modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(all = 5.dp),
            horizontalArrangement = Arrangement.spacedBy(space = 10.dp, alignment = Alignment.Start),
            verticalAlignment = Alignment.CenterVertically){
            Image(painter = painterResource(id = selectedStratagem.iconId), contentDescription = "Stratagem icon",
                modifier = Modifier
                    .background(color = Color.Black)
                    .clip(shape = RoundedCornerShape(20.dp))
                    .size(50.dp)
                    .padding(all = 5.dp))
            Text(text = stringResource(id = selectedStratagem.displayNameID),
                fontSize = 26.sp,
                textAlign = TextAlign.Left)
        }
    }
}

fun pickRandom(enemies: String, stratTypes: List<String>, allowBackpackDoubling: Boolean = false): List<Int>{

    var tempStratagemList: MutableList<Int> = mutableListOf(-1, -1, -1, -1)
    var redoList: Boolean
    var temp: Int
    var excludeAsOther: MutableList<String> = mutableListOf()

    for(type in stratTypes){
        if(type !in listOf(stratType.ANY.name, stratType.OTHER.name)){
            excludeAsOther.add(type)
        }
    }

    do{
        redoList = false
        for(i in 0..< tempStratagemList.size) {
            do{
                temp = Random.nextInt(from = 0, until = stratagemList.size)
            } while(temp in tempStratagemList ||
                stratTypes[i] !in listOf(stratagemList[temp].typ, stratType.ANY.name, stratType.OTHER.name) ||
                stratagemList[temp].enemy !in listOf("any", enemies) ||
                (stratTypes[i] == stratType.OTHER.name && stratagemList[temp].typ in excludeAsOther))
            tempStratagemList[i] = temp
        }

        if(!allowBackpackDoubling &&
            stratTypes.count{it == stratType.BACKPACK.name} < 2 &&
            tempStratagemList.count{"backpack" in stratagemList[it].tags} > 1){
            redoList = true
        }

    } while(redoList)

    return tempStratagemList
}