//Check the number is prime or not

object Prime {

  def prime(n:Int, m:Int): Boolean= {
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
    return prime(n, m+1)
  }

  def main(args: Array[String]): Unit = {
    print("Enter a number: ")
    val result = scala.io.StdIn.readInt()
    println("Is Prime: "+prime(result,2))
    println("Is Prime: "+prime(5,2))
    println("Is Prime: "+prime(8,2))
  }
}
