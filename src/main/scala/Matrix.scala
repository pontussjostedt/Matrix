case class Matrix(underlying: Vector[Vector[Double]]) {
  
    
    def +(matrix: Matrix): Matrix = {
        val out = for(r <- underlying.indices) yield {
            for(c <- underlying(r).indices) yield {
                this(r, c) + matrix(r,c)
            }
        }.toVector
        Matrix(out.toVector)
    }

    def -(matrix: Matrix): Matrix = {
        val out = for(r <- underlying.indices) yield {
            for(c <- underlying(r).indices) yield {
                this(r, c) - matrix(r,c)
            }
        }.toVector
        Matrix(out.toVector)
    }

    def *(matrix: Matrix): Matrix = {
        Matrix(
        {for(r <- underlying.indices) yield {
            for(c <- underlying(r).indices) yield {
                println(s"At (row $r and colum $c) is the row = ${underlying(r)} and the colum = ${matrix.getColum(c)} which = ${underlying(r) * matrix.getColum(c)}")
                underlying(r) * matrix.getColum(c)
            }
        }.toVector}.toVector)
    }

    def apply(r: Int, c: Int): Double = {
        underlying(r)(c)
    }

    def getColum(c: Int): Vector[Double] = {
        {for(r <- underlying.indices) yield {
            underlying(r)(c)
        }}.toVector
    }

    extension(vector: Vector[Double]) {
        def * (in: Vector[Double]): Double = {
            var out = 0D
            for(i <- vector.indices)
                out += vector(i) * in(i)
            out
        }

        
    }

    override def toString(): String = {
        "\n" + underlying.mkString("\n")
    }
}
