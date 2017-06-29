package com.pavlenko.algorithm

import scala.collection.mutable

/**
 * Tieu owns a pizza restaurant and he manages it in his own way. While in a normal restaurant, a
 * customer is served by following the first-come, first-served rule, Tieu simply minimizes the average
 * waiting time of his customers. So he gets to decide who is served first, regardless of how sooner or later
 * a person comes.
 *
 * Different kinds of pizzas take different amounts of time to cook. Also, once he starts cooking a pizza, he
 * cannot cook another pizza until the first pizza is completely cooked. Let's say we have three customers
 * who come at time t=0, t=1, & t=2 respectively, and the time needed to cook their pizzas is 3, 9, & 6
 * respectively. If Tieu applies first-come, first-served rule, then the waiting time of three customers is 3,
 * 11, & 16 respectively. The average waiting time in this case is (3 + 11 + 16) / 3 = 10. This is not an
 * optimized solution. After serving the first customer at time t=3, Tieu can choose to serve the third
 * customer. In that case, the waiting time will be 3, 7, & 17 respectively. Hence the average waiting time
 * is (3 + 7 + 17) / 3 = 9.
 *
 * Help Tieu achieve the minimum average waiting time. For the sake of simplicity, just find the integer part
 * of the minimum average waiting time.
 *
 * @author sergii.pavlenko
 * @since Jul 27, 2017
 */
object MinAverageWaitingTime {

  case class Customer(orderTime: Long, cookTime: Long) {
    override def toString(): String = s"Customer orderTime: $orderTime, cookTime: $cookTime"
  }

  def main(args: Array[String]): Unit = {
    val n = io.StdIn.readInt

    var customers = (1 to n)
      .map(_ => io.StdIn.readLine)
      .map(ln => Customer(ln.split(" ").head.toInt, ln.split(" ").last.toInt))
      .toList.sortBy(_.orderTime)

    val waitingQueue = new mutable.PriorityQueue[Customer]()(Ordering.by((_: Customer).cookTime).reverse)

    var currentTime: Long = 0
    var totalWaitingTime: Long = 0
    while (waitingQueue.nonEmpty || customers.nonEmpty) {
      while (customers.nonEmpty && (waitingQueue.isEmpty || customers.head.orderTime <= currentTime)) {
        val head = customers.head
        waitingQueue.enqueue(head)
        currentTime = Math.max(currentTime, head.orderTime)
        customers = customers.tail
      }

      val c = waitingQueue.dequeue()
      currentTime += c.cookTime
      totalWaitingTime += currentTime - c.orderTime
    }

    println(totalWaitingTime / n)
  }
}
