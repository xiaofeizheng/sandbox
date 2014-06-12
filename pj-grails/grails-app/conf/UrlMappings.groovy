class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        group "/item", {
            "/add"(controller:"/item", action:"add")
            "/delete"(controller:"/item", action:"delete")
            "500"(view:'/error')
	    }
    }
}
