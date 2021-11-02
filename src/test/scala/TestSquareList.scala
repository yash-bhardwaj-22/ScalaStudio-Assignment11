import org.scalatest.flatspec.AnyFlatSpec

class TestSquareList extends AnyFlatSpec{
  val newList = new SquareList
  val list = List(1,3,5,7,9)
  val emptyList = List()

  //Test case for Non-Empty List using squareListMatch method
  "squareListMatch method" should "return the square of list" in {
    assert(newList.squareListMatch(list) == List(1, 9, 25, 49, 81))
  }

  //Test case for empty List using squareListMatch method
  "squareListMatch method" should "return empty list" in {
    assert(newList.squareListMatch(emptyList) == List())
  }

  //Test case for Non-Empty List using squareListMap method
  "squareListMap method" should "return the square of list" in {
    assert(newList.squareListMap(list) == List(1, 9, 25, 49, 81))
  }

  //Test case for empty List using squareListMap method
  "squareListMap method" should "return empty list" in {
    assert(newList.squareListMap(emptyList) == List())
  }
}
