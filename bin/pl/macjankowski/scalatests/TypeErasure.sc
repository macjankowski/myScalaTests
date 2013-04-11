package pl.macjankowski.scalatests

object TypeErasure {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  val maker = new Factory[String]                 //> maker  : pl.macjankowski.scalatests.Factory[String] = pl.macjankowski.scalat
                                                  //| ests.Factory@7d26f75b
  maker.make                                      //> res0: String = ""

}

//class MakeFoo[A](implicit manifest: Manifest[A]){
//	def make: A = manifest.runtimeClass.newInstance.asInstanceOf[A]
//}

//trait Maker[T: Manifest] {
//  def make: A = manifest.runtimeClass.newInstance.asInstanceOf[A]
//}

class Factory[A: Manifest] {
  def make: A = manifest.runtimeClass.newInstance.asInstanceOf[A]
}