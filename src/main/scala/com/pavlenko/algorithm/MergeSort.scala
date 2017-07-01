package com.pavlenko.algorithm

/**
 * Merge sort algorithm
 *
 * @author sergii.pavlenko
 * @since Jun 27, 2017
 */
object MergeSort {
  def sort(list: List[Long]): List[Long] = {
    val n = list.length / 2
    if (n == 0) list
    else {
      def merge(left: List[Long], right: List[Long]): List[Long] =
        left match {
          case Nil => right
          case x :: left1 =>
            right match {
              case Nil => left
              case y :: right1 =>
                if (x < y) x :: merge(left1, right)
                else y :: merge(left, right1)
            }
        }
      val (left, right) = list splitAt n
      merge(sort(left), sort(right))
    }
  }
}
