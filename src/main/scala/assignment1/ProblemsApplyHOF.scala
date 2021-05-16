package assignment1

import list.traits.IntList

/**
  * Complete the following exercises to practice the usage of higher order functions.
  */
object ProblemsApplyHOF {

  /**
    * multiplyAndFilterEven should multiply all elements of the IntList by
    * the factor x and filter all element that are even
    *
    * multiplyAndFilterEven soll alle Elemente der IntList mit dem Faktor x multiplizieren und alle Elemente filtern, die gerade sind
    */
  def multiplyAndFilterEven(l: IntList, x: Int): IntList = {
    val l2: Array[Int] = Array.ofDim[Int](l.length)
    for (k <- 0 until l.length) {
      l2(k) = k + x
    }
    var gerade: Int = 0
    for (k <- l if k % 2 == 0) {
      gerade += 1
    }
    val l3: Array[Int] = Array.ofDim[Int](gerade)
    var index: Int = 0
    for (k <- 0 until l2.length if l2(k) % 2 == 0) {
      l3(index) = l2(k) { index += 1; index - 1 }
    }
    l3
  }

  /**
    * findMin should find the smallest element of a list
   *
   * findMin soll das kleinste Element einer Liste finden
    */
  def findMin(l: IntList): Int = {
    var kleinstes: Int = liste(0)
    for (k <- l if k < kleinstes) {
      kleinstes = k
    }
    kleinstes
  }

  /**
    * sumOddNumbers should sum up all odd numbers of a list
   *
   * sumOddNumbers soll alle ungeraden Zahlen einer Liste aufsummieren
    */
  def sumOddNumbers(l: IntList): Int = {
    var ungerade_summe: Int = 0
    for (k <- l if k % 2 != 0) {
      ungerade_summe += k
    }
    ungerade_summe
  }

  /**
    * countEvenNumbers should count all even numbers of a list
   *
   * countEvenNumbers soll alle geraden Zahlen einer Liste zählen
    */
  def countEvenNumbers(l: IntList): Int = {
    var gerade: Int = 0
    for (k <- l if k % 2 == 0) {
      gerade += 1
    }
    gerade
  }
}
