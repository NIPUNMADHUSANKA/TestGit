object Q_03 {

  def main(args: Array[String]): Unit = {
        println(sum(5))
  }


  def sum(n:Int):Int={
    n match {
      case 1 => n
      case _ => n + sum(n-1)

    }

  }

}
