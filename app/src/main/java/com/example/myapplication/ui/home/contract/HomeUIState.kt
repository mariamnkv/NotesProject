package ru.mariamnkv.NotesProject.ui.home.contract

import ru.mariamnkv.NotesProject.core.UIState

data class GithubUsersUIState(
  val users: List<UIUser> = emptyList(),
  val isLoading: Boolean = false
): UIState

data class UIUser(
  val id: String,
  val login: String,
  val avatarUrl:String,
  val url: String
)