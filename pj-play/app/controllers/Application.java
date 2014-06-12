package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

import play.libs.Json;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class Application extends Controller {

    public static Result index() {
        //return ok(index.render("Your new application is ready."));
        ObjectNode result = Json.newObject();
        result.put("status", "OK");
        result.put("message", "Hello Stranger");
        return ok(result);
    }

}
