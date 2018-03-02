def timesTable (input: Int) : List[String] = {
  val x = List.range(1,11)
  x.map{
    y =>
      val r = y * input
      s"$y * $input = $r \n"
  }
}
timesTable(6)