class C {
  def foo(a: Int) {
    val f1 = () => a
    val f2 = (x: Int) => x * a
    val f3 = (z: String) => s"$z$a$z"
  }
}
