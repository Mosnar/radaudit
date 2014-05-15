package radiusauth

import java.util.Date;

class RadiusAuthOutcome {
	// searchable doesn't work with postgres.
	//static searchable = true;
	/*
	       Column        |            Type             |
	 outcome_type        | character varying(8)        | not null
	 user_name           | character varying(64)       | not null
	 calling_station_id  | character varying(24)       | not null
	 nas_identifier      | character varying(64)       |
	 nas_ip_address      | inet                        |
	 authority           | character varying(64)       |
	 authentication_type | character varying(40)       |
	 eap_type            | character varying(24)       |
	 last_accept_time    | timestamp without time zone |
	 last_reject_time    | timestamp without time zone |
	 accept_count        | integer                     |
	 reject_count        | integer                     |
	 event_time          | timestamp without time zone |
	 retention_id        | integer                     |
	 client_id           | integer                     | not null default nextval('radius_client_outcome_client_id_seq'::regclass)

	 */
	
	String outcome_type;
	String user_name;
	String calling_station_id;
	String nas_identifier;
	
	// This one is funky. No inet datatype available to us through standard radius_client_outcome table.
	// Carl created a view within the postgresql file that converts this value to a string. Thanks, Carl!
	String nas_ip_address;
	
	String authority;
	String authentication_type;
	String eap_type;
	Date last_accept_time; //
	Date last_reject_time; //
	Integer accept_count;
	Integer reject_count;
	Date event_time; //
	Integer retention_id;
	Integer client_id;

	
    static constraints = {
		outcome_type(nullable:false, blank: false, size:0..8)
		user_name(nullable:false, blank: false, size:0..64)
		calling_station_id(nullable:false, blank: false, size:0..24)

		nas_identifier(nullable:true, blank:true, size:0..64)
		nas_ip_address(nullable:true, blank:true)
		authority(nullable:true, blank:true, size:0..64)
		authentication_type(nullable:true, blank:true, size:0..40)
		eap_type(nullable:true, blank:true, size:0..24)
		last_accept_time(nullable:true, blank:true)
		last_reject_time(nullable:true, blank:true)
		accept_count(nullable:true, blank:true)
		reject_count(nullable:true, blank:true)
		event_time(nullable:true, blank:true)
		retention_id(nullable:true, blank:true)
		
		client_id(nullable:false, blank:false)
    }
	
	static mapping = {
		table "radius_client_outcome_view"
		version false
		id name: 'client_id'
		id generator: 'sequence', params: [sequence: 'radius_client_outcome_client_id_seq']
		
	}

}
