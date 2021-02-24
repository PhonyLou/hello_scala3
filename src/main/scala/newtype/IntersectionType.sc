trait A {
  def add(): Unit
  def child: List[A]
}

trait B {
  def sub(): Unit
  def child: List[B]
 }

def f(x: A & B) = {
  x.child
}

class C extends A with B {
  override def add() = ()
  override def sub() = ()
  override def child: List[A & B] = ???
}