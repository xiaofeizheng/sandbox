package pj.grails

class ItemController {

    def index() {
       render(contentType: "application/json") {
           hello = "world"
       }
    }

    def add() {
       render(contentType: "application/json") {
           add = "item"
       }
    }

    def delete() {
       render(contentType: "application/json") {
           delete = "item"
       }
    }


}
