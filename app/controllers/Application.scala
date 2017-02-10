package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Hello world : I am using tag in github now. this is the second test(version v1.1.0)"))
  }

}