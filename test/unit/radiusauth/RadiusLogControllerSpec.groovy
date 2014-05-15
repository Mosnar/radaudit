package radiusauth

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(RadiusLogController)
class RadiusLogControllerSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

	/**
	 * This method will test the index action, which should render the index view
	 */
    void "test index"() {
		when:
		controller.index()
		
		then:
		view == '/radiusLog/index'
    }
	
	
	/**
	 * This method will test the search action when no parameters are supplied. 
	 * The view should be set to the index
	 */
	void "test search with no params"() {
		when:
		controller.search();
		
		then:
		view == '/radiusLog/index'
	}
	
	/**
	 * This will test the search action with empty parameters when trimmed (ie, "   " is empty)
	 * The view should be set to the index
	 */
	void "test search with empty params"() {
		when:
		params.q = "  "
		controller.search();
		
		then:
		view == '/radiusLog/index'
	}

	
}
