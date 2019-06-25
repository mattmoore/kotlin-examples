class Person(var firstName: String, var lastName: String) {
  init {
    System.loadLibrary("hello")
  }

  external fun greet(): String;
}
