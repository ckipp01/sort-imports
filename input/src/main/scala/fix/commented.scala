/*
rule = SortImports
 SortImports.blocks = [
 "java",
 "scala",
 "*",
 "com.sun"
 ]
 */
import scala.util._ // foobar
import scala.collection._
// Do I have to use Java
import java.util.Map
import com.oracle.net._
import com.sun.awt._
import java.math.BigInteger

/**
 *  Bla
 */
object Bla {
  // I need the time
  import java.time.Instant

  val foo = "Hello" // World
}
