package radiusauth
/**
 * The purpose of this controller to provide interface actions for the Radius authentication logs
 * @author Ransom Roberson
 * @date January 24, 2014
 *
 */
class RadiusLogController {

	/**
	 * Default action. Will redirect to the "browse" action
	 */
	def index() {
		render(view:"index")
	}

	def search() {
		if (params.q && !params.q.trim().isEmpty()) {
			try {
				def results = RadiusAuthOutcome.findAllWhere(user_name: params.q.toLowerCase())

				render(view:"search", model: [numPeople: results.size(),search: params.q.toLowerCase(), results: results])
			} catch (Exception e) {
				render(view:"index")
			}
			
		} else {
			render(view:"index")
		}
	}
}
