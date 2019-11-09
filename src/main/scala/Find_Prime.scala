object Main extends App {
  def FindPrime (i: Int): List[Int] = i match {
    case 2 => List(2)
    case _ => {
      val primeList = FindPrime(i-1)
      if (IsPrime(i, primeList)) i :: primeList else primeList
    }
  }
  def IsPrime (num: Int, prePrimes: List[Int]): Boolean = prePrimes.forall(num % _ != 0)
  println(FindPrime(scala.io.StdIn.readInt()).reverse)
}
