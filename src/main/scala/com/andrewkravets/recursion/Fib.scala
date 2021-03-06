package com.andrewkravets.recursion

object Fib {

  def simpleFib(x: Int): Int = {
    if (x == 0) 0
    else if (x == 1) x
    else simpleFib(x - 1) + simpleFib(x - 2)
  }

  def tailFib(x: Int): Int = {
    def loop(acc: Int, b: Int, x: Int): Int = {
      if (x == 0) acc
      else loop(b, acc + b, x-1)
    }
    loop(0, 1, x)
  }

}
