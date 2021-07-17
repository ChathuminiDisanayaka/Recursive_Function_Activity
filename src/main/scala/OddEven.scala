import Add.sum
//This program is to find out a given number is odd or even

object OddEven {
  def check(n: Int): Boolean = {
    if(n == 0)
       true
    else if(n == 1)
       false
    else if(n<0)
      check(-n)
    else
      check(n-2)
  }


  def main(array: Array[String]): Unit= {
    print("Enter a number: ")
    val num = scala.io.StdIn.readInt()
    if (check(num))
      {
        println("Even Number")
      }
    else
      {
        println("Odd Number")
      }
      println("Is Even: "+check(15))
      println("Is Even: "+check(20))
  }
}
