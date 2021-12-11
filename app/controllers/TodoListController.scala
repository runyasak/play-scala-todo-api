package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import play.api.libs.json._

import scala.collection.mutable.ListBuffer
import models._

@Singleton
class TodoListController @Inject() (
    val controllerComponents: ControllerComponents
) extends BaseController {

  private val todoList = new ListBuffer[TodoListItem]()
  todoList += TodoListItem(1, "Buy new laptop", true)
  todoList += TodoListItem(2, "Call mom", false)

  implicit val todoItemJsonFormat = Json.format[TodoListItem]

  def getAll(): Action[AnyContent] = Action {
    if (todoList.isEmpty) {
      NoContent
    } else {
      Ok(Json.toJson(todoList))
    }
  }
}
