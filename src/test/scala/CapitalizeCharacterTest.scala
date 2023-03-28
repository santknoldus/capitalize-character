package com.knoldus.operationonlist

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.TryValues._

class CapitalizeCharacterTest extends AnyFunSuite {

  test("capitalizeCharacter should return a list of strings with all 'a's capitalized") {
    val input = List("My", "name", "is", "Michael", "Scott")
    val expected = List("My", "nAme","is","MichAel", "Scott")
    assert(CapitalizeCharacter.capitalizeCharacter(input).success.value === expected)
  }

  test("capitalizeCharacter should return a Failure when given an empty list") {
    val input = List.empty[String]
    assert(CapitalizeCharacter.capitalizeCharacter(input).isFailure)
  }

  test("capitalizeCharacter should return a Failure when given a list with a null element") {
    val input = List("My", null, "name")
    assert(CapitalizeCharacter.capitalizeCharacter(input).isFailure)
  }
}