package pl.macjankowski.scalatests

import pl.macjankowski.scalatests.collections.TravPatternMatch
import junit.framework.TestCase

/**
 * @author "Maciej Jankowski <mac.rarry@gmail.com>"
 *
 */
class TestTravPatternMatch extends TestCase {

  def testPrintAll() {
    val c = new TravPatternMatch
    c.printAll(List(1, 4, 3, 2))
    c.printAll(Seq(1, 4, 3, 2))
    c.printAll(Set(1, 4, 3, 2))
  }

  def testSet() {
    val mySet = Set(1, 2, 3, 4, 5)
    println(mySet.head)
    println(mySet.tail)

    object SetExtractor {
      def unapplySeq[T](s: Set[T]): Option[Seq[T]] = Some(s.toSeq)
    }

    mySet match {
      case SetExtractor(x, xs @ _*) => println(s"x = $x\nxs = $xs")
    }
  }
}