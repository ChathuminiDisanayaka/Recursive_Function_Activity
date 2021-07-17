//
object Fibonnaci {
  def fibo(num: Int): Int=
  {
    if (num == 0)
      0
    else if (num == 1)
      1
    else
      return fibo(num - 1) + fibo(num - 2)
  }


  def main(array: Array[String]): Unit= {
    print("Enter a number: ")
    val num = scala.io.StdIn.readInt()
    println("Fibonnaci Number Sereies Upto " + num + " is," )

    for (m<-0 to num-1 )
    {
      print(fibo(m))
      print(" ")
    }
  }
}
