package repositories

import com.mongodb.{DBCollection, DBObject}
import it.unifi.cerm.playmorphia.PlayMorphia
import javax.inject.Inject
import models.Post
import java.util

import scala.beans.BeanProperty

abstract class MongoDatabaseManager (@Inject playMorphia: PlayMorphia){

  def getCollection: DBCollection = {
    playMorphia.datastore().getCollection(new Post().getClass)
  }

  def getList: util.List[DBObject]

}
