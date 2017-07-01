package com.pavlenko.algorithm

/**
 * Quick sort algorithm
 *
 * @author sergii.pavlenko
 * @since Jul 01, 2017
 */
object QuickSort {
  def sort(a: List[Int]): List[Int] =
    if (a.length < 2) a
    else {
      val pivot = a(a.length / 2)
      sort(a.filter(pivot >)) ++ (a.filter(pivot ==)) ++ sort(a.filter(pivot <))
    }
}
