package Tutorial4

import scala.io.StdIn

object Q2 {
  def main(args:Array[String]): Unit = {

    println("Enter the number: ")
    val num = StdIn.readInt()

    println(patternMatching(num))
  }

  def patternMatching(number : Int): String = number match{
    case x if x < 0 => "Negative Number"
    case x if x == 0 => "Zero"
    case x if x%2 == 0 => "Even Number"
    case x if x%2 != 0 => "Odd Number"
  }

    }
