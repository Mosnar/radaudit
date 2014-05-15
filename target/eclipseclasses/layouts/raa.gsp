<!DOCTYPE html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title><g:layoutTitle default="RADIUS Auth Auditor" /></title>

<link rel="stylesheet"
	href="${resource(dir: 'css', file: 'bootstrap.min.css')}"
	type="text/css">
<link rel="stylesheet" href="${resource(dir: 'css', file: 'raa.css')}"
	type="text/css">
<g:layoutHead />
<g:javascript library="jquery" />
<g:javascript library="bootstrap" />
<g:javascript library="raa" />
<r:layoutResources />

</head>
<body>
	<div class="container">
		<div class="navbar navbar-default" role="navigation">
			<g:form url="[action:'search',controller:'radiusLog']"
				name="frmSearch" class="navbar-form navbar-left" role="search" method="get">
				<div class="form-group">
					<input type="text" name="q"
						class="form-control search-field" placeholder="User Name"
						value="${search}">
				</div>
				<button class="btn btn-primary" type="submit">Search</button>
			</g:form>
		</div>
		<g:layoutBody />
	</div>

	<r:layoutResources />
</body>
</html>
