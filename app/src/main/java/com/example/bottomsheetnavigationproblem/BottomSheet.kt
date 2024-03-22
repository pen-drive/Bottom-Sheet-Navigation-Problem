package com.example.bottomsheetnavigationproblem

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.compose.currentStateAsState
import androidx.navigation.NavBackStackEntry
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.spec.DestinationStyleBottomSheet


@Destination(style = DestinationStyleBottomSheet::class)
@Composable
fun BottomSheet(
    navBackStackEntry: NavBackStackEntry,
) {

    val lifecycleState = navBackStackEntry.lifecycle.currentStateAsState()

    StatePrinter(lifecycleState, "BottomSheet")

}


@Composable
fun StatePrinter(lifecycleState: State<Lifecycle.State>, which: String) {
//    Timber.d("$which : ${lifecyclerState.value.name}")

}

