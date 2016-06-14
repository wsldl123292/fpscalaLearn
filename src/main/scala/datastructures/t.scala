package datastructures

/**
  * 功能:
  * 作者: ldl
  * 时间: 2016-06-14 22-11-2016
  */
object t {

    def main(args: Array[String]) {

        val x = List(1,2,3,4) match {
            case Cons(x,Cons(2,Cons(4,_))) => x
            case Nil => 42
            case Cons(x,Cons(y,Cons(3,Cons(4,_)))) => x + y
            case _ => 101
        }

        println(x)
    }

}
