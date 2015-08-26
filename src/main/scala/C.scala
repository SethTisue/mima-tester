class C {
  def foo() {
    val f1 = () => ()
    val f2 = (x: Int) => x * x
    val f3 = (z: String) => s"$z$z$z"
  }
}
