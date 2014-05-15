import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_radiusAuth_radiusLogsearch_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/radiusLog/search.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("raa")],-1)
printHtmlPart(1)
})
invokeTag('captureHead','sitemesh',5,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
expressionOut.print(numPeople)
printHtmlPart(3)
expressionOut.print(search)
printHtmlPart(4)
if(true && (numPeople != 0)) {
printHtmlPart(5)
loop:{
int i = 0
for( event in (results) ) {
printHtmlPart(6)
expressionOut.print(event.client_id)
printHtmlPart(7)
expressionOut.print(event.user_name)
printHtmlPart(8)
expressionOut.print(event.outcome_type)
printHtmlPart(8)
invokeTag('formatDate','g',32,['format':("yyyy-MM-dd h:m:s a"),'date':(event.event_time)],-1)
printHtmlPart(8)
expressionOut.print(event.client_id)
printHtmlPart(9)
expressionOut.print(event.client_id)
printHtmlPart(10)
expressionOut.print(event.client_id)
printHtmlPart(11)
expressionOut.print(event.user_name)
printHtmlPart(12)
expressionOut.print(event.calling_station_id)
printHtmlPart(13)
expressionOut.print(event.outcome_type)
printHtmlPart(14)
expressionOut.print(event.nas_ip_address)
printHtmlPart(15)
expressionOut.print(event.authority)
printHtmlPart(16)
expressionOut.print(event.authentication_type)
printHtmlPart(16)
expressionOut.print(event.authentication_type)
printHtmlPart(17)
expressionOut.print(event.accept_count)
printHtmlPart(18)
expressionOut.print(event.reject_count)
printHtmlPart(19)
invokeTag('formatDate','g',100,['format':("yyyy-MM-dd h:m:s a"),'date':(event.event_time)],-1)
printHtmlPart(20)
expressionOut.print(event.retention_id)
printHtmlPart(21)
expressionOut.print(event.client_id)
printHtmlPart(22)
i++
}
}
printHtmlPart(23)
}
printHtmlPart(1)
})
invokeTag('captureBody','sitemesh',119,[:],1)
printHtmlPart(24)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1399578673000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
