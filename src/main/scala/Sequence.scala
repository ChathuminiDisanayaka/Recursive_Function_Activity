//Print all prime numbers for a given limit

object Sequence {
  def primeseq(n: Int, m: Int): Boolean = {
    if (n <= 2)
    {
      if (n==2)
        return true
      else
        return false
    }
    if (n%m == 0)
    {
      return false
    }
    if (m*m>n)
    {
      return true
    }
    return primeseq(n, m+1)
  }

  def main(array: Array[String]): Unit= {
    print("Enter a number: ")
    val num = scala.io.StdIn.readInt()
    println("Prime Numbers Upto  "+num+ " are, ")
    for (m <- 1 to num)
      {
        if(primeseq(m,2)){
          print(m)
          print(" ")
        }
      }
  }
}
