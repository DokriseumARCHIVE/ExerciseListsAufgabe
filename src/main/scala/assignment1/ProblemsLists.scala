package assignment1

import list.traits.IntList

object ProblemsLists {

  /**
    *
    * Given a number i that should be duplicated a number of times
    * returns an IntList that contains the duplicated i
    *
    * E.x. duplicateNum(4,3)
    * -> SinglyLinkedList(4, 4, 4, 4)
    *
    * @param i number to duplicate
    * @param times number of duplicates
    * @return List of duplicated numbers
    */
  def duplicateNum(i:Int, times:Int):IntList= ???

  /**
    *
    * Given an IntList l that contains even and odd numbers
    * All even numbers of the list should be duplicated an number of times
    * returns an IntList that contains the all duplicated even numbers and the
    * remaining odd numbers in the same order as they occur in the origin list
    *
    * E.x. duplicateEqualNumbers(3,SinglyLinkedList(1,4,3,5,8))
    * -> SinglyLinkedList(1, 4, 4, 4, 3, 5, 8, 8, 8)
    *
    * @param times number of duplicates
    * @param l IntList that should be processed
    * @return IntList that contains the duplicates and all other nums
    */
  def duplicateEqualNumbers(times:Int, l:IntList): IntList= ???

  /**
    *
    * Given two ordered IntLists l1 and l2 (ascending)
    * The function should merge the two ordered lists in a manner
    * that the result is ordered as well
    *
    * E.x. merge(SinglyLinkedList(3, 5, 7), SinglyLinkedList(1, 3, 5, 8))
    * -> SinglyLinkedList(1, 3, 3, 5, 5, 7, 8)
    *
    * @param l1 IntList in an ascending order
    * @param l2 IntList in an ascending order
    * @return IntList that contains all numbers of both lists in an ascending order
    */
  def merge(l1:IntList, l2:IntList):IntList= ???

  /**
    *
    * Given an unordered IntList
    * The function should split the List in the middle
    * It returns two separated lists
    * If the size of the origin list is odd, the first resulting list
    * should contain one more element than the second
    *
    * E.x. splitList(SinglyLinkedList(3, 5, 7, 1, 3, 5, 8))
    * -> SinglyLinkedList(3, 5, 7, 1) SinglyLinkedList(3, 5, 8)
    *
    * @param l IntList to split
    * @return A tuple of two IntLists that contains the separated lists
    */
  def splitList(l:IntList):(IntList,IntList)= ???

  /**
    *
    * Given an unordered IntList
    * The function should sort the list using the merge sort algorithm
    *
    * E.x. mergeSort(SinglyLinkedList(3, 5, 7, 1, 3, 5, 8))
    * -> SinglyLinkedList(1, 3, 3, 5, 5, 7, 8)
    * Merge Sort Algorithm: https://de.wikipedia.org/wiki/Mergesort
    *
    * @param l IntList to sort
    * @return Sorted IntList
    */
  def mergeSort(l:IntList):IntList= ???


  /*

  Harder Problems - Optional

   */
  /**
    *
    * Given a amount of money and a list of coin values,
    * returns the number of possible ways that the change can be returned using
    * coins of those values.
    *
    * E.x. countChange(4,SinglyLinkedList(1,2)
    * has 3 solutions -> {1+1+1+1 ; 2+2 ; 1+2+1}
    *
    * @param money total amount of change to return
    * @param coins possible coins
    * @return number of possible ways the change can be returned
    */
  def countChange(Money: Int, coins: IntList): Int = ???

}
