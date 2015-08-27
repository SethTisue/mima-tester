class C {
  var a = 5
  def foo() {
    val f1 = () => a.toString
    val f2 = (x: Int) => x * a
    val f3 = (z: String) => s"$z$a$z"
  }
}
