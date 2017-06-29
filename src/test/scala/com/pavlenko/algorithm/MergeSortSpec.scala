package com.pavlenko.algorithm

import org.scalatest.{Matchers, FunSpec}

/**
 * Tests for {@link MergeSort}
 *
 * @author sergii.pavlenko
 * @since Jun 27, 2017
 */
class MergeSortSpec extends FunSpec with Matchers {
  describe("MergeSort") {
    describe("#sort") {
      it("should return sorted list") {
        MergeSort.sort(List(4, 6, 3, 5, 2, 1, 8)) should be(List(1, 2, 3, 4, 5, 6, 8))
      }
    }
  }
}
