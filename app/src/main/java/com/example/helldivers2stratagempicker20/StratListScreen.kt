package com.example.helldivers2stratagempicker20

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.helldivers2stratagempicker20.ui.theme.Helldivers2StratagemPicker20Theme

@Composable
fun StratListScreen() {
    Helldivers2StratagemPicker20Theme {
        Column(
            Modifier
                .fillMaxWidth()
                .padding(top = 25.dp)
                .verticalScroll(state = rememberScrollState())
        ) {
            stratagemList.indices.forEach() {
                singleSelectedStratagem(selectedStratagemIndex = it)
            }
        }
    }
}