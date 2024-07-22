package com.example.helldivers2stratagempicker20

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.helldivers2stratagempicker20.ui.theme.Helldivers2StratagemPicker20Theme

@Composable
fun StratTypesScreen(selectedTypes: List<String>, selectTypes: (Int, String) -> (Unit)) {
//    var selectedType1 by remember { mutableStateOf(value = "any") }
//    var selectedType2 by remember { mutableStateOf(value = "any") }
//    var selectedType3 by remember { mutableStateOf(value = "any") }
//    var selectedType4 by remember { mutableStateOf(value = "any") }
//    val selectTypes: (Int, String) -> Unit = { i, s ->
//        when (i) {
//            1 -> selectedType1 = s
//            2 -> selectedType2 = s
//            3 -> selectedType3 = s
//            4 -> selectedType4 = s
//        }
//    }
    Column(
        modifier = Modifier
            .padding(top = 25.dp)
            .verticalScroll(rememberScrollState())
            .fillMaxWidth()
    ) {
        stratTypeSelectionPanel(1, selectedType = selectedTypes[0], onRadioClick = selectTypes)
        stratTypeSelectionPanel(2, selectedType = selectedTypes[1], onRadioClick = selectTypes)
        stratTypeSelectionPanel(3, selectedType = selectedTypes[2], onRadioClick = selectTypes)
        stratTypeSelectionPanel(4, selectedType = selectedTypes[3], onRadioClick = selectTypes)
    }

}

@Composable
fun stratTypeSelectionPanel(
    index: Int, selectedType: String,
    onRadioClick: (Int, String) -> Unit
) {
    Helldivers2StratagemPicker20Theme {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 20.dp)
                .wrapContentHeight()
        ) {
            Text(
                text = "Stratagem $index type:",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = colorResource(id = R.color.white),
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        color = colorResource(
                            id = R.color.purple_500
                        )
                    )
            )
            for (type in stratType.entries) {
                radioButtonWithText(
                    text = type.name,
                    isSelected = (selectedType == type.name),
                    onClick = { onRadioClick(index, type.name) },
                    fontSize = 16
                )
            }
        }
    }
}