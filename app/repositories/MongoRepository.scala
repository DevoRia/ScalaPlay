package repositories
import java.util

import com.mongodb.DBObject
import it.unifi.cerm.playmorphia.PlayMorphia
import javax.inject.{Inject, Singleton}
import models.Post
class MongoRepository (@Inject playMorphia: PlayMorphia) extends MongoDatabaseManager(playMorphia) {

  override def getList: util.List[DBObject] = {
    val cursor = getCollection.find()
    val objects = new util.ArrayList[DBObject]
    while (cursor.hasNext){
      objects.add(cursor.next())
    }
    objects
  }

}
