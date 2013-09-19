/**
 *
 */
package pl.macjankowski.stackoverflow

/**
 * @author "Maciej Jankowski <mac.rarry@gmail.com>"
 *
 */
class Task_18507362 {

  object Main {
    //    def main(args: Array[String]) {
    //      trait T1 {
    //        def f1[T](a: T): Double
    //      }
    //
    //      val ea1 = new T1 {
    //        def f1(a: List[String]): Double = a.length
    //      }
    //    }

    def test() {
      val list = List(1, 2, 3, 4, 5, 6, 7, 8)

      val a = list map (tmp => tmp != 1 && tmp > -1 && tmp < 4)
      println(a)
    }
  }
}