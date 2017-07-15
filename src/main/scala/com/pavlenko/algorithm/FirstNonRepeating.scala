package com.pavlenko.algorithm

import scala.annotation.tailrec

/**
 * Finds first non repeating character in string
 *
 * @author sergii.pavlenko
 * @since Jul 15, 2017
 */
object FirstNonRepeating {

  /**
   * Returns a string representation of first unique letter
   */
  def firstUnique(str: String): String =
    String.valueOf(str.drop(str.takeWhile(c => str.count(_ == c) > 1).size).headOption.getOrElse(""))
}