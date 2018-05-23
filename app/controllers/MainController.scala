package controllers

import javax.inject.Inject
import play.api.mvc.{AbstractController, ControllerComponents, Result}
import services.DataService

import scala.beans.BeanProperty

@Singleton
class MainController @Inject()(cc: ControllerComponents) extends AbstractController(cc){

  @Inject
  @BeanProperty
  val dataService: DataService = _

  def index = Action {
    Ok(dataService.getPosts)
  }

}
