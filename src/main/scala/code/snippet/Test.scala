package code 
package snippet 

import scala.xml.{NodeSeq, Text}
import net.liftweb.util._
import net.liftweb.common._
import java.util.Date
import code.lib._
import Helpers._

class Test {
  
  val liLines = List("regel1","regel2")
    
   def test = "li *" #> liLines &
              "bla" #> "hoi"

}

