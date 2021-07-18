object Q_06 {

  def main(args: Array[String]): Unit = {
        fiboseq(10)
  }

  def fibo(x:Int):Int = x match{
    case y if y == 0 => 0
    case y if y == 1 => 1
    case y => fibo(x-1) + fibo(x-2)
  }

  def fiboseq(p:Int):Unit={
    if (p > 0) {
      fiboseq(p-1)
    }
    println(fibo(p))
  }

}
