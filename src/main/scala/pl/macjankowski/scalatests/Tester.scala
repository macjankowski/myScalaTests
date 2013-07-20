package pl.macjankowski.scalatests

/**
 * @author mac
 *
 */
trait A

trait B extends A

case class C extends B

trait Tester[-T] { def test(t: T): Boolean }

object Tester {

  
}
