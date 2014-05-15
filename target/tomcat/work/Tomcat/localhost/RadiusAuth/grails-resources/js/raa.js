
$(document).ready(function() {
	$(".event-info-function").click(function() {
		var selector = "#info_table_id_"+this.id;
		$(selector).slideToggle();
	});
});