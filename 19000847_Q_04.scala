object Q_04 {

  def main(args: Array[String]): Unit = {
        println(even(3))
        println(even(5))
  }

  def even(n:Int):String={
    n match {
      case 0 => "Even"
      case 1 => "Odd"
      case _ => even(n-2)
    }
  }

}
