import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_radiusAuth_layoutsraa_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/layouts/raa.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',3,['gsp_sm_xmlClosingForEmptyTag':(""),'charset':("utf-8")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("viewport"),'content':("width=device-width, initial-scale=1.0")],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('layoutTitle','g',7,['default':("RADIUS Auth Auditor")],-1)
})
invokeTag('captureTitle','sitemesh',7,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',7,[:],2)
printHtmlPart(3)
expressionOut.print(resource(dir: 'css', file: 'bootstrap.min.css'))
printHtmlPart(4)
expressionOut.print(resource(dir: 'css', file: 'raa.css'))
printHtmlPart(5)
invokeTag('layoutHead','g',14,[:],-1)
printHtmlPart(1)
invokeTag('javascript','g',15,['library':("jquery")],-1)
printHtmlPart(1)
invokeTag('javascript','g',16,['library':("bootstrap")],-1)
printHtmlPart(1)
invokeTag('javascript','g',17,['library':("raa")],-1)
printHtmlPart(1)
invokeTag('layoutResources','r',18,[:],-1)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',20,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(6)
createTagBody(2, {->
printHtmlPart(7)
expressionOut.print(search)
printHtmlPart(8)
})
invokeTag('form','g',32,['url':([action:'search',controller:'radiusLog']),'name':("frmSearch"),'class':("navbar-form navbar-left"),'role':("search"),'method':("get")],2)
printHtmlPart(9)
invokeTag('layoutBody','g',34,[:],-1)
printHtmlPart(10)
invokeTag('layoutResources','r',37,[:],-1)
printHtmlPart(1)
})
invokeTag('captureBody','sitemesh',38,[:],1)
printHtmlPart(11)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1399576933000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
