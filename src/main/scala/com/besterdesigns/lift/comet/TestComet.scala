package com.besterdesigns.lift.comet

import net.liftweb.http.CometActor
import net.liftweb.http.SHtml
import net.liftweb.http.js.JsCmds
import scala.xml.Text
import com.besterdesigns.lift.snippet.ARequestVar
import net.liftweb.common.Full

class TestComet extends CometActor {
    def render = {
    "#redirect1" #> SHtml.a(() => JsCmds.RedirectTo("/apage"), Text("JsCmds.RedirectTo"), "class" -> "btn btn-small") &
    "#redirect2" #> SHtml.a(() => JsCmds.RedirectTo("/bpage", () => ARequestVar(Full("testing from comet"))), Text("JsCmds.RedirectTo *"), "class" -> "btn btn-small") &
    "#redirect3" #> SHtml.a(() => JsCmds.RedirectTo("/ctx/apage"), Text("JsCmds.RedirectTo"), "class" -> "btn btn-small")
  }
}