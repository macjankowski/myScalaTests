package pl.macjankowski.scalatests

object TypeErasure {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(100); 
  println("Welcome to the Scala worksheet");$skip(35); 

  val maker = new Factory[String];System.out.println("""maker  : pl.macjankowski.scalatests.Factory[String] = """ + $show(maker ));$skip(13); val res$0 = 
  maker.make;System.out.println("""res0: String = """ + $show(res$0))}

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
