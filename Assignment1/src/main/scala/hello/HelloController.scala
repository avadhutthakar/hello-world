package hello

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
/**
 * HelloController.scala
 * This is controller to print the "Hello World".
 * @author Avadhut Thakar
 * @since 1.0
 */
 
@RestController
class HelloController() {

  /*
   * This controller prints Hello World on the screen.
   * Returns String hello = "Hello, World!"
   */
  @RequestMapping(Array("/hello"))
  def sayHello: String = {
    val hello: String = "Hello, World!";
    return hello
  }
}
