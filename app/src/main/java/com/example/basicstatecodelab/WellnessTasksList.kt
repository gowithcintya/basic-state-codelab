package com.example.basicstatecodelab

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

@Composable
fun WellnessTaskList(
    modifier: Modifier = Modifier,
    list : List<WellnessTask> = remember { getWellnessTasks() }
){
    LazyColumn(
        state = rememberLazyListState(),
        modifier = modifier) {
        items(list) { task ->
            WellnessTaskItem(taskName = task.label)
        }
    }
}

fun getWellnessTasks() = List(50) { i ->
    WellnessTask(i, "Task $i")
}
