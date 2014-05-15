dataSource {
	pooled = true
	driverClassName = "org.postgresql.Driver"
	dialect = "org.hibernate.dialect.PostgreSQLDialect"
	username = "radius_web"
	password = "PASSWORD_HERE"
}

hibernate {
	cache.use_second_level_cache = true
	cache.use_query_cache = false
	cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory' // Hibernate 3
	//    cache.region.factory_class = 'org.hibernate.cache.ehcache.EhCacheRegionFactory' // Hibernate 4
}

// environment specific settings
environments {
	development {
		dataSource {
			dbCreate = "validate"
			url = "jdbc:postgresql://HOST:PORT/DB"
			username = "radius_web"
			password = "PASSWORD_HERE"
		}
	}
	test {
		/*
		dataSource {
			dbCreate = "update"
			url = "jdbc:h2:mem:testDb;MVCC=TRUE;LOCK_TIMEOUT=10000;DB_CLOSE_ON_EXIT=FALSE"
		}
		*/
	}
	production {
		dataSource {
			dbCreate = "validate"
			url = "jdbc:postgresql://HOST:PORT/DB"
			username = "radius_web"
			password = "PASSWORD_HERE"
		}
	}
}
