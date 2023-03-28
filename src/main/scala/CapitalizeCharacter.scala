package com.knoldus.operationonlist

import scala.util.Try

object CapitalizeCharacter {

  // function to capitalize 'a' in the list of strings
  def capitalizeCharacter(list: List[String]): Try[List[String]] = {
    Try {
      list match {
        case list if(list.nonEmpty) => list.map(string =>
          string.map(character =>
            if (character == 'a') character.toUpper
            else character)
        )
        case _ => throw new IllegalStateException()
      }
    }
  }
}