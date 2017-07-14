package com.pavlenko.algorithm

/**
 * Binary search algorithm
 *
 * @author sergii.pavlenko
 * @since Jul 14, 2017
 */
object BinarySearch {
  def search(list: Array[Int], key: Int): Int = {
    var left = 0
    var right = list.length - 1
    while (left <= right) {
      val mid = left + (right - left) / 2
      if (list(mid) == key)
        mid
      else if (list(mid) > key)
        right = mid - 1
      else
        left = mid + 1
    }
    -1
  }

  def searchRecursive(list: Array[Int], key: Int)(start: Int = 0, end: Int = list.length - 1): Int = {
    if (start > end) return -1
    val mid = start + (end - start + 1) / 2
    if (list(mid) == key)
      mid
    else if (list(mid) > key)
      searchRecursive(list, key)(start, mid - 1)
    else
      searchRecursive(list, key)(mid + 1, end)
  }

  def searchFunctional(list: Array[Int], key: Int): Int = {
    def bsf(list: Array[Int], key: Int, start: Int, end: Int): Int = {
      if (start > end) return -1
      val mid = start + (end - start + 1) / 2
      list match {
        case (arr: Array[Int]) if (arr(mid) == key) => mid
        case (arr: Array[Int]) if (arr(mid) > key)  => bsf(list, key, start, mid - 1)
        case (arr: Array[Int]) if (arr(mid) < key)  => bsf(list, key, mid + 1, end)
      }
    }
    bsf(list, key, 0, list.length - 1)
  }
}