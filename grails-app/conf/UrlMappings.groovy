class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/" {
			controller = "RadiusLog"
		}
        "500"(view:'/error')
	}
}
