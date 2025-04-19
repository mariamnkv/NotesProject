package ru.mariamnkv.NotesProject.ui.home.contract

import ru.mariamnkv.NotesProject.core.UIEvent

sealed class HomeUIEvent: UIEvent {
  data object OnRefreshClick: HomeUIEvent()
  data class OnUserClick(val url: String): HomeUIEvent()
}