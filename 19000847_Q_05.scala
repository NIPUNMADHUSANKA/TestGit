object Q_05 {

  def main(args: Array[String]): Unit = {
    evenseq(10)
  }

  def even(n:Int):Boolean={
    n match {
      case 0 => true
      case 1 => false
      case _ => even(n-2)
    }
  }

  def evenseq(n:Int):Unit={
    if (n>0){
      evenseq(n-1)
    }
    if (even(n)) println(n)
  }

}
