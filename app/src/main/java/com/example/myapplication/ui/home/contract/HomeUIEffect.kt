package ru.mariamnkv.NotesProject.ui.home.contract

import ru.mariamnkv.NotesProject.core.UIEffect

sealed class HomeUIEffect: UIEffect {

  data class ShowNotification(val message: String): HomeUIEffect()
  data class OpenUrl(val url: String): HomeUIEffect()
}