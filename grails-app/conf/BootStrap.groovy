import radiusauth.RadiusAuthOutcome
import grails.util.*
class BootStrap {

	def init = { servletContext ->

		/*
		new RadiusAuthOutcome(
				outcome_type:"Accept",
				user_name:"ransom93",
				calling_station_id:"2C-44-01-C5-A7-DF",
				nas_identifier:"cas-wlc-5508-2",
				nas_ip_address:"198.82.171.156",
				authority:"CNS_WLAN",
				authentication_type:"Network-Password",
				eap_type:"PEAP",
				last_accept_time:"2013-12-13 11:55:05",
				last_reject_time:"2013-12-11 15:53:39",
				accept_count:460,
				reject_count:37,
				event_time:"2013-12-13 11:55:05",
				rentention_id:null,
				client_id:45887
				).save()

		new RadiusAuthOutcome(
				outcome_type:"Accept",
				user_name:"ransom93",
				calling_station_id:"00-24-D7-CF-67-FC",
				nas_identifier:"cas-wlc-5508-2",
				nas_ip_address:"198.82.171.156",
				authority:"CNS_WLAN",
				authentication_type:"CNS_WLAN",
				eap_type:"EAP-TLS",
				last_accept_time:"2013-12-13 13:39:37",
				last_reject_time:null,
				accept_count:70,
				reject_count:0,
				event_time:"2013-12-13 13:39:37",
				rentention_id:null,
				client_id:37155
				).save()
	*/
	}
	
	def destroy = {
	}
}
