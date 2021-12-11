package controllers

import javax.inject._
import play.api._
import play.api.mvc._


@Singleton
class TodoController @Inject()(val controllerComponents: ControllerComponents) 
	extends BaseController {
	
def getAll(): Action[AnyContent] = Action {NoContent}
}