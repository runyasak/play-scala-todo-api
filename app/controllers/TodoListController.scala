package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import scala.collection.mutable.ListBuffer
import models._

@Singleton
class TodoController @Inject() (val controllerComponents: ControllerComponents)
    extends BaseController {

  private val todoList = new ListBuffer[TodoListItem]()
  todoList += TodoListItem(1, "Buy new laptop", true)
  todoList += TodoListItem(2, "Call mom", false)

  def getAll(): Action[AnyContent] = Action { NoContent }
}
