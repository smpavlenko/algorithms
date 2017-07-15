package com.pavlenko.algorithm

import org.scalatest.{ Matchers, FunSpec }

/**
 * Tests for {@link FirstNonRepeating}
 *
 * @author sergii.pavlenko
 * @since Jul 15, 2017
 */
class FirstNonRepeatingSpec extends FunSpec with Matchers {
  describe("FirstNonRepeating") {
    describe("#firstUnique") {
      it("should return result") {
        FirstNonRepeating.firstUnique("absdfghtj ykuabsdfmghtjyku ii") should be("m")
      }

      it("should return empty string") {
        FirstNonRepeating.firstUnique("absdfghtj ykuabsdfmghtjyku iiabsdfghtj ykuabsdfmghtjyku ii") should be("")
      }
    }
  }
}