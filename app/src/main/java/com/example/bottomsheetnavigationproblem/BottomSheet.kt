package com.example.bottomsheetnavigationproblem

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.core.provider.FontsContractCompat.Columns
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.compose.currentStateAsState
import androidx.navigation.NavBackStackEntry
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.spec.DestinationStyleBottomSheet


@Destination(style = DestinationStyleBottomSheet::class)
@Composable
fun ColumnScope.BottomSheet(
    navBackStackEntry: NavBackStackEntry,
) {

    val lifecycleState = navBackStackEntry.lifecycle.currentStateAsState()

    StatePrinter(lifecycleState, "BottomSheet")


    Box(modifier = Modifier.height(350.dp).fillMaxWidth(), contentAlignment = Alignment.Center) {
        Text(text = "Bottom Sheet Content")
    }

}


@Composable
fun StatePrinter(lifecycleState: State<Lifecycle.State>, which: String) {
//    Timber.d("$which : ${lifecyclerState.value.name}")

}

