//Print the addition of numbers upto given input

object Add {
  def sum(num: Int): Int=
  {
    if (num == 1)
      1
    else
      sum(num - 1) + num
  }


  def main(array: Array[String]): Unit= {
    print("Enter a number: ")
    val num = scala.io.StdIn.readInt()
    println("Sum of the Numbers Upto  "+num+ " is "+ sum(num))

}
}
