package pl.macjankowski.scalatests.collections

/**
 * @author "Maciej Jankowski <mac.rarry@gmail.com>"
 *
 */
class TravPatternMatch {

  def printAll[T](t: Traversable[T]): Unit = t match {
    case Nil => println("empty")
    case x :: xs =>
      println(x)
      printAll(xs)
  }

}