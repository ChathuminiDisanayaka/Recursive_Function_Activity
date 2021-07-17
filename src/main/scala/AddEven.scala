object AddEven {
  def sumeven(n:Int, sum:Int, i:Int):Int={
    if(i>=n)
      {
        return sum
      }
      return sumeven(n,sum+i,i+2)
        return (n+i+sum)
  }
  def main (array: Array[String]):Unit={
    var n = 10
    println("Sum of Even Numbers: "+ sumeven(n,0,0))
  }
}
