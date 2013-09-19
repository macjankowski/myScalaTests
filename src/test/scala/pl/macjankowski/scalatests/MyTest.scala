/**
 *
 */
package pl.macjankowski.scalatests

import junit.framework.TestCase

/**
 * @author "Maciej Jankowski <mac.rarry@gmail.com>"
 *
 */
class MyTest extends TestCase {

  def test() {
    val list = List(1, 2, 3, 4, 5, 6, 7, 8)
    def isCorrect(v: Int) = v != 1 && v > -1  && v < 4

    val a = list map (tmp => tmp != 1 && tmp > -1 && tmp < 4)
    val b = list filter isCorrect
    println(b)
  }
}