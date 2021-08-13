package com.carrier

import utest._

object HelloSpec extends TestSuite {
  val tests = Tests {
    test("say hello") {
      assert(Hello.greeting == "hello")
    }
  }
}
