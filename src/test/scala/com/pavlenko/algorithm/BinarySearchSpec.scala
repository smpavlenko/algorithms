package com.pavlenko.algorithm

import org.scalatest.{ Matchers, FunSpec }

/**
 * Tests for {@link BinarySearch}
 *
 * @author sergii.pavlenko
 * @since Jul 14, 2017
 */
class BinarySearchSpec extends FunSpec with Matchers {
  describe("BinarySearch") {
    describe("#search") {
      it("should return result") {
        BinarySearch.search(Array(1, 3, 4, 7, 9, 11, 18), 4) should be(2)
      }

      it("should return -1") {
        BinarySearch.search(Array(1, 3, 4, 7, 9, 11, 18), 5) should be(-1)
      }
    }

    describe("#searchRecursive") {
      it("should return result") {
        BinarySearch.searchRecursive(Array(1, 3, 4, 7, 9, 11, 18), 4)(0, 6) should be(2)
      }

      it("should return -1") {
        BinarySearch.searchRecursive(Array(1, 3, 4, 7, 9, 11, 18), 5)(0, 6) should be(-1)
      }
    }

    describe("#searchFunctional") {
      it("should return result") {
        BinarySearch.searchFunctional(Array(1, 3, 4, 7, 9, 11, 18), 4) should be(2)
      }

      it("should return -1") {
        BinarySearch.searchFunctional(Array(1, 3, 4, 7, 9, 11, 18), 5) should be(-1)
      }
    }
  }

}