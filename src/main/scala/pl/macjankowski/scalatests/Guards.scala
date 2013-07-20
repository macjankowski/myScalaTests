package pl.macjankowski.scalatests

object Guards extends App {

  class Dupa
  case class IntWrap(value: Int)
  implicit def intWrapToInt(intWrap: IntWrap) = intWrap.value
  

  def matchInt(x: AnyVal) = x match {
    case i: Int => println("intWrap")
    case _ => println("other")
  }
  
  //test
  matchInt(IntWrap(12))
  matchInt(12)
  matchInt("abc")
}