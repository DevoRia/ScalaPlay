package models

import com.fasterxml.jackson.databind.BeanProperty
import org.mongodb.morphia.annotations.{Entity, Id}
import sun.util.calendar.BaseCalendar.Date

import scala.beans.BeanProperty

@Entity(value = "blog.posts")
class Post {

  @Id
  @BeanProperty
  var _id: String = _

  @BeanProperty
  var author: String = _

  @BeanProperty
  var text: String = _

  @BeanProperty
  var date: Date = _

}
