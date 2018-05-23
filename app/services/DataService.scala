package services

import com.fasterxml.jackson.databind.JsonNode
import javax.inject.Inject
import models.Post
import play.libs.Json
import repositories.MongoRepository
import java.util

import com.mongodb.DBObject

import scala.beans.BeanProperty
class DataService @Inject()(mongoRepository: MongoRepository){

  def getPosts:  util.List[DBObject] = {
     mongoRepository.getList
  }

}
