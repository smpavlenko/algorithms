package com.pavlenko.algorithm

import org.scalatest.{Matchers, FunSpec}

/**
 * Tests for {@link QuickSort}
 *
 * @author sergii.pavlenko
 * @since Jul 01, 2017
 */
class QuickSortSpec extends FunSpec with Matchers {
  describe("QuickSort#sort") {
    it("[4, 6, 3, 5, 2, 1, 8] should return sorted list") {
      QuickSort.sort(List(4, 6, 3, 5, 2, 1, 8)) should be(List(1, 2, 3, 4, 5, 6, 8))
    }

    it("[4, 4, 3, 1, 2, 1, 3] should return sorted list") {
      QuickSort.sort(List(4, 4, 3, 1, 2, 1, 3)) should be(List(1, 1, 2, 3, 3, 4, 4))
    }

    it("[1] should return sorted list") {
      QuickSort.sort(List(1)) should be(List(1))
    }

    it("[] should return sorted list") {
      QuickSort.sort(List()) should be(List())
    }
  }
}
