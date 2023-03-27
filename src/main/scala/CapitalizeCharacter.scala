package com.knoldus.operationonlist

object CapitalizeCharacter {

  // function to capitalize 'a' in the list of strings
  def capitalizeCharacter(list: List[String]): List[String] = {
    if (list.isEmpty) throw new IllegalStateException()
    else {
      list.map(string =>
        string.map(character =>
          if (character == 'a') character.toUpper
          else character)
      )
    }
  }
}