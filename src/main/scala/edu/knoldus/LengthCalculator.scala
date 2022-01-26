package edu.knoldus

import scala.annotation.tailrec

class LengthCalculator{
  @tailrec
  final def calculateLength[T](list: Iterable[T], accumulator: Int = 0): Int = {
    if(list.toList.isEmpty) accumulator
    else calculateLength(list.toList.tail, accumulator + 1)
  }
}
