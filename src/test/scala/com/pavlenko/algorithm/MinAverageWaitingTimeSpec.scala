package com.pavlenko.algorithm

import java.io.{ByteArrayOutputStream, ByteArrayInputStream}

import org.scalatest.{Matchers, FunSpec}

/**
 * Tests for {@link MinAverageWaitingTime}
 * @author sergii.pavlenko
 * @since Jul 29, 2017
 */
class MinAverageWaitingTimeSpec extends FunSpec with Matchers {
  describe("MinAverageWaitingTime") {

    it("3,9,6 should return 9") {

      val in = new ByteArrayInputStream("3\n0 3\n1 9\n2 6".getBytes)
      val myOut = new ByteArrayOutputStream()

      Console.withIn(in) {
        Console.withOut(myOut) {
          MinAverageWaitingTime.main(Array[String]())
        }
      }
      myOut.toString should be("9\n")
    }

    it("3,9,5 should return 8") {
      val in = new ByteArrayInputStream("3\n0 3\n1 9\n2 5".getBytes)
      val myOut = new ByteArrayOutputStream()

      Console.withIn(in) {
        Console.withOut(myOut) {
          MinAverageWaitingTime.main(Array[String]())
        }
      }
      myOut.toString should be("8\n")
    }

    it("2,3,6,4,1,8,2,2 should return 8") {
      val in = new ByteArrayInputStream("8\n0 2\n1 3\n2 6\n3 4\n4 1\n5 8\n6 2\n7 2".getBytes)
      val myOut = new ByteArrayOutputStream()

      Console.withIn(in) {
        Console.withOut(myOut) {
          MinAverageWaitingTime.main(Array[String]())
        }
      }
      myOut.toString should be("8\n")
    }
  }
}
