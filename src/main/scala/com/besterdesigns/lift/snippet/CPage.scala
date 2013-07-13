package com.besterdesigns.lift
package snippet

import scala.xml.{NodeSeq, Text}
import net.liftweb.util._
import net.liftweb.common._
import java.util.Date
import com.besterdesigns.lift.lib._
import Helpers._

class CPage {
  lazy val date: Box[Date] = DependencyFactory.inject[Date] // inject the date

  def render = "#test *" #> date.map(_.toString)
}

