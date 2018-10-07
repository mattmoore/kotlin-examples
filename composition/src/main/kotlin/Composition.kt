import arrow.core.compose

val takeEvens = { xs: List<Int> ->
  xs.filter { it % 2 == 0 }
}

val takeGreaterThan3 = { xs: List<Int> ->
  xs.filter { it > 3 }
}

val combine = { xs: List<Int> ->
  xs.reduce { xs, x -> xs + x }
}

val takeEvensGreaterThan3 =
  takeGreaterThan3 compose takeEvens

val takeSumOfEvensGreaterThan3 =
  combine compose takeGreaterThan3 compose takeEvens
