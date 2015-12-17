package controllers

import com.google.inject.Inject
import com.test.Util
import play.api.libs.ws.WSClient
import play.api.mvc._

class Application @Inject()(val client: WSClient) extends Controller {

  def index() = Action{
    Ok(Util.generateUUID)
  }
}
