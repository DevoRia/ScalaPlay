package controllers

import javax.inject.Inject
import play.api.mvc.{AbstractController, ControllerComponents}
import services.DataService
import play.libs.Json


class MainController @Inject()(cc: ControllerComponents, dataService: DataService) extends AbstractController(cc){

  def index = Action {
    Ok("dfdf")
  }

}
