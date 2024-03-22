package com.example.bottomsheetnavigationproblem

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import com.example.bottomsheetnavigationproblem.destinations.BottomSheetDestination
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import com.ramcosta.composedestinations.navigation.EmptyDestinationsNavigator


@Destination(start = true)
@Composable
fun MainScreen(
    navigator: DestinationsNavigator = EmptyDestinationsNavigator,
) {
    Box(contentAlignment = Alignment.Center){
        Button(onClick = {
            navigator.navigate(BottomSheetDestination)
        }) {
            Text(text = "Open BottomSheet")
        }
    }
}