
object main {
  
  @main
  def run(): Unit = {
      val matrixOne = Matrix(Vector(Vector(1, -2, 3), Vector(0, 2, -1)))
      val matrixTwo = Matrix(Vector(Vector(2, -2, 3), Vector(-3, 6, -1), Vector(0, 2, 3)))
      println(matrixOne * matrixTwo)
  }
}
 

