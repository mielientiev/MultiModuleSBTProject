package controllers

import com.google.inject.Inject
import play.api.libs.ws.WSClient
import play.api.mvc._

class Application @Inject()(val client: WSClient) extends Controller {

  def index() = Action{
    Ok(com.test.Util.generateUUID)
  }
}
