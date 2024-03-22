package com.example.bottomsheetnavigationproblem

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.currentStateAsState
import androidx.navigation.NavBackStackEntry
import com.example.bottomsheetnavigationproblem.destinations.BottomSheetDestination
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import com.ramcosta.composedestinations.navigation.EmptyDestinationsNavigator


@Destination(start = true)
@Composable
fun MainScreen(
    navigator: DestinationsNavigator = EmptyDestinationsNavigator,
    navBackStackEntry: NavBackStackEntry
) {
    val navBackStackEntryState =  navBackStackEntry.lifecycle.currentStateAsState()

    Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()){
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "navBackStackEntry State: ${navBackStackEntryState.value.name}")
            Button(onClick = {
                navigator.navigate(BottomSheetDestination(), onlyIfResumed = true)
            }) {
                Text(text = "Open BottomSheet")
            }
        }

    }
}