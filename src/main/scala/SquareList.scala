class SquareList {
  def squareListMatch(xs: List[Int]): List[Int] =
    xs match {
      case List() => List()
      case y :: ys => (y * y) :: squareListMatch(ys)
    }
  def squareListMap(xs: List[Int]): List[Int] = {
    xs map (x => x * x)
  }
}
