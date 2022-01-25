package edu.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class LengthCalculatorTest extends AnyFlatSpec {
  behavior of "calculateLength"

  val lengthCalculator = new LengthCalculator

  "calculateLength" should "calculate length of List[Int]" in {
    val intList: List[Int] = List(1, 2, 3)
    assertResult(intList.length)(lengthCalculator.calculateLength(intList))
  }

  it should "calculate length of Set[String]" in {
    val stringSet: Set[String] = Set("Prakhar", "Learning", "Scala", "in", "Knoldus")
    assertResult(stringSet.toList.length)(lengthCalculator.calculateLength(stringSet))
  }

  it should "calculate length of map" in {
    val map = Map(1 -> "One", 2 -> "Two", 3 -> "Three")
    assertResult(map.toList.length)(lengthCalculator.calculateLength(map))
  }

  it should "calculate length of String" in {
    val string = "Prakhar"
    assertResult(string.length)(lengthCalculator.calculateLength(string))
  }

  it should "return 0 for empty collection" in {
    val emptyDoubleVector: Vector[Double] = Vector()
    assertResult(0)(lengthCalculator.calculateLength(emptyDoubleVector))
  }
}
