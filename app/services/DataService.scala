package services

import com.fasterxml.jackson.databind.JsonNode
import javax.inject.Inject
import play.libs.Json
import repositories.MongoRepository

import scala.beans.BeanProperty

class DataService  {

  @Inject
  @BeanProperty
  var mongoRepository: MongoRepository = _

  def getPosts:  JsonNode = {
    Json.toJson(mongoRepository.getList)
  }

}
