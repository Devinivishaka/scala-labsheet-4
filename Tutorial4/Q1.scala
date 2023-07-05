package Tutorial4

object Q1 {
  def main(args: Array[String]): Unit = {

    val depositAmount = 100000

    println("Calculated Interest is: " + calculateInterest(depositAmount))

    def calculateInterest(depositAmount: Double): Double = depositAmount match {

      case amount if amount <= 20000 => amount * 0.02
      case amount if amount <= 200000 => amount * 0.04
      case amount if amount <= 2000000 => amount * 0.035
      case amount => amount * 0.065
    }

  }
}
