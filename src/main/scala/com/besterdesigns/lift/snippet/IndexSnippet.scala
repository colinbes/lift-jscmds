package com.besterdesigns.lift
package snippet

import com.besterdesigns.lift.lib._
import scala.xml.{NodeSeq, Text}
import net.liftweb.util._
import net.liftweb.common._
import java.util.Date
import Helpers._
import net.liftweb.http.RequestVar
import net.liftweb.http.SHtml
import net.liftweb.http.S
import net.liftweb.http.js.JsCmd
import net.liftweb.http.js.JsCmds

object ARequestVar extends RequestVar[Box[String]] (Empty)

class IndexSnippet {
  lazy val date: Box[Date] = DependencyFactory.inject[Date] // inject the date

  def render = {
    "#redirect1" #> SHtml.a(() => JsCmds.RedirectTo("/apage"), Text("JsCmds.RedirectTo"), "class" -> "btn btn-small") &
    "#redirect2" #> SHtml.a(() => JsCmds.RedirectTo("/bpage", () => ARequestVar(Full("testing"))), Text("JsCmds.RedirectTo *"), "class" -> "btn btn-small") &
    "#redirect3" #> SHtml.a(() => S.redirectTo("/cpage"), Text("S.redirectTo"), "class" -> "btn btn-small") andThen SHtml.makeFormsAjax
  }
}