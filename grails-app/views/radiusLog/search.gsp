<!DOCTYPE html>
<html>
<head>
<meta name="layout" content="raa" />
</head>
<body>
	<h3>
		There are <strong> ${numPeople}
		</strong> entries matching your search term, <strong><u>
				${search}
		</u> </strong>
	</h3>
	<g:if test="${numPeople != 0}">
		<div class="row row-title">
			<div class="col-md-3">User Name</div>
			<div class="col-md-3">Outcome</div>
			<div class="col-md-3">Time</div>
			<div class="col-md-3">Client ID</div>
		</div>
		<g:each in="${ results }" var="event" status="i">

			<div class="row row-item">
				<a href="#" class="event-info-function" id="${ event.client_id }">
					<div class="col-md-3">
						${ event.user_name }
					</div>
					<div class="col-md-3">
						${ event.outcome_type }
					</div>
					<div class="col-md-3">
						<g:formatDate format="yyyy-MM-dd h:m:s a"
							date="${ event.event_time }" />
					</div>
					<div class="col-md-3">
						${ event.client_id }
					</div>
				</a>
			</div>
			<div class="container info-container"
				id="info_table_id_${event.client_id }">
				<table class="table table-striped info-table"
					id="info_table_id_${event.client_id }">
					<tr>
						<td><strong>User Name</strong></td>
						<td>
							${event.user_name }
						</td>
					</tr>
					<tr>
						<td><strong>Calling Station ID</strong></td>
						<td>
							${event.calling_station_id }
						</td>
					</tr>
					<tr>
						<td><strong>Outcome Type</strong></td>
						<td>
							${event.outcome_type }
						</td>
					</tr>
					<tr>
						<td><strong>NAS IP Address</strong></td>
						<td>
							${event.nas_ip_address }
						</td>
					</tr>
					<tr>
						<td><strong>Authority</strong></td>
						<td>
							${event.authority }
						</td>
					</tr>
					<tr>
						<td><strong>Authentication Type</strong></td>
						<td>
							${event.authentication_type }
						</td>
					</tr>
					<tr>
						<td><strong>EAP Type</strong></td>
						<td>
							${event.eap_type }
						</td>
					</tr>
					<tr>
						<td><strong>Accept Count</strong></td>
						<td>
							${event.accept_count }
						</td>
					</tr>
					<tr>
						<td><strong>Reject Count</strong></td>
						<td>
							${event.reject_count }
						</td>
					</tr>
					<tr>
						<td><strong>Event Time</strong></td>
						<td><g:formatDate format="yyyy-MM-dd h:m:s a"
								date="${ event.event_time }" /></td>
					</tr>
					<tr>
						<td><strong>Retention ID</strong></td>
						<td>
							${event.retention_id }
						</td>
					</tr>
					<tr>
						<td><strong>Client ID</strong></td>
						<td>
							${event.client_id }
						</td>
					</tr>
				</table>
			</div>
		</g:each>

	</g:if>
</body>
</html>