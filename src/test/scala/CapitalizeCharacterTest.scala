package com.knoldus.operationonlist

import org.scalatest.funsuite.AnyFunSuite

class CapitalizeCharacterTest extends AnyFunSuite {

  test("list with only one string") {
    val list = List("Sant")
    assert(CapitalizeCharacter.capitalizeCharacter(list) === List("SAnt"))
  }

  test("list with multiple strings") {
    val list = List("My", "name", "is", "Michael", "Scott")
    assert(CapitalizeCharacter.capitalizeCharacter(list) === List("My", "nAme", "is", "MichAel", "Scott"))
  }

  test("list with no string") {
    val list = List()
    assertThrows[IllegalStateException](CapitalizeCharacter.capitalizeCharacter(list))
  }
}