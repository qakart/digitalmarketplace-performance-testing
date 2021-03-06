
import utils.DigitalMarketplaceHttpConf

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import utils.ScenarioHelpers._

import utils.SimulationProperties._

class SupplierEditServiceDetailsSimulation extends Simulation with DigitalMarketplaceHttpConf{

	val httpProtocol = http
		.baseURL("https://staging.beta.digitalmarketplace.service.gov.uk")
		.inferHtmlResources()
		.acceptHeader("image/webp,*/*;q=0.8")
		.acceptEncodingHeader("gzip, deflate, sdch")
		.acceptLanguageHeader("en-US,en;q=0.8")
		.connection("keep-alive")
		.contentTypeHeader("application/x-www-form-urlencoded")
		.userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.132 Safari/537.36")

	val headers_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"Cache-Control" -> "max-age=0")

	val headers_1 = Map("Accept" -> "text/css,*/*;q=0.1")

	val headers_5 = Map("Accept" -> "*/*")

	val headers_15 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate",
		"Cache-Control" -> "max-age=0",
		"Origin" -> "https://staging.beta.digitalmarketplace.service.gov.uk")

	val headers_30 = Map("Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8")

    val uri2 = "https://staging.beta.digitalmarketplace.service.gov.uk/suppliers"

	val scn = scenario("SupplierEditServiceDetailsSimulation")
		.keepRepeating {
		exec(http("request_0")
			.get("/suppliers/login")
			.headers(headers_0)
			.resources(http("request_1")
			.get(uri2 + "/static/stylesheets/govuk-template.css?0.12.0")
			.headers(headers_1),
				http("request_2")
					.get(uri2 + "/static/stylesheets/fonts.css?0.12.0")
					.headers(headers_1),
				http("request_3")
					.get(uri2 + "/static/stylesheets/application.css")
					.headers(headers_1),
				http("request_4")
					.get(uri2 + "/static/images/gov.uk_logotype_crown.png?0.12.0"),
				http("request_5")
					.get(uri2 + "/static/javascripts/govuk-template.js?0.12.0")
					.headers(headers_5),
				http("request_6")
					.get(uri2 + "/static/javascripts/application.js")
					.headers(headers_5),
				http("request_7")
					.get(uri2 + "/static/stylesheets/govuk-template-print.css?0.12.0")
					.headers(headers_1),
				http("request_8")
					.get(uri2 + "/static/stylesheets/external-links/external-link.png?0.12.0"),
				http("request_9")
					.get(uri2 + "/static/stylesheets/images/open-government-licence.png?0.12.0"),
				http("request_10")
					.get(uri2 + "/static/stylesheets/images/govuk-crest.png?0.12.0")))
			.pause(minIdleTime milliseconds, maxIdleTime milliseconds)
			.exec(http("request_15")
			.post("/suppliers/login")
			.headers(headers_15)
			.formParam("csrf_token", "None")
			.formParam("email_address", s"${username}")
			.formParam("password", s"${password}")
			.resources(http("request_16")
			.get(uri2 + "/static/stylesheets/govuk-template.css?0.12.0")
			.headers(headers_1),
				http("request_17")
					.get(uri2 + "/static/stylesheets/fonts.css?0.12.0")
					.headers(headers_1),
				http("request_18")
					.get(uri2 + "/static/stylesheets/application.css")
					.headers(headers_1),
				http("request_19")
					.get(uri2 + "/static/images/gov.uk_logotype_crown.png?0.12.0"),
				http("request_20")
					.get(uri2 + "/static/javascripts/govuk-template.js?0.12.0")
					.headers(headers_5),
				http("request_21")
					.get(uri2 + "/static/stylesheets/govuk-template-print.css?0.12.0")
					.headers(headers_1),
				http("request_22")
					.get(uri2 + "/static/javascripts/application.js")
					.headers(headers_5),
				http("request_23")
					.get(uri2 + "/static/stylesheets/external-links/external-link.png?0.12.0"),
				http("request_24")
					.get(uri2 + "/static/stylesheets/images/open-government-licence.png?0.12.0"),
				http("request_25")
					.get(uri2 + "/static/stylesheets/images/govuk-crest.png?0.12.0")))
			.pause(minIdleTime milliseconds, maxIdleTime milliseconds)
			.exec(http("request_30")
			.get("/suppliers/services")
			.headers(headers_30)
			.resources(http("request_31")
			.get(uri2 + "/static/stylesheets/govuk-template.css?0.12.0")
			.headers(headers_1),
				http("request_32")
					.get(uri2 + "/static/stylesheets/fonts.css?0.12.0")
					.headers(headers_1),
				http("request_33")
					.get(uri2 + "/static/stylesheets/application.css")
					.headers(headers_1),
				http("request_34")
					.get(uri2 + "/static/images/gov.uk_logotype_crown.png?0.12.0"),
				http("request_35")
					.get(uri2 + "/static/javascripts/govuk-template.js?0.12.0")
					.headers(headers_5),
				http("request_36")
					.get(uri2 + "/static/javascripts/application.js")
					.headers(headers_5),
				http("request_37")
					.get(uri2 + "/static/stylesheets/govuk-template-print.css?0.12.0")
					.headers(headers_1),
				http("request_38")
					.get(uri2 + "/static/images/breadcrumb-separator.png"),
				http("request_39")
					.get(uri2 + "/static/stylesheets/external-links/external-link.png?0.12.0"),
				http("request_40")
					.get(uri2 + "/static/stylesheets/images/open-government-licence.png?0.12.0"),
				http("request_41")
					.get(uri2 + "/static/stylesheets/images/govuk-crest.png?0.12.0")))
			.pause(minIdleTime milliseconds, maxIdleTime milliseconds)
			.exec(http("request_46")
			.get("/suppliers/services/5958282199957504")
			.headers(headers_30)
			.resources(http("request_47")
			.get(uri2 + "/static/stylesheets/govuk-template.css?0.12.0")
			.headers(headers_1),
				http("request_48")
					.get(uri2 + "/static/stylesheets/fonts.css?0.12.0")
					.headers(headers_1),
				http("request_49")
					.get(uri2 + "/static/stylesheets/application.css")
					.headers(headers_1),
				http("request_50")
					.get(uri2 + "/static/stylesheets/govuk-template-print.css?0.12.0")
					.headers(headers_1),
				http("request_51")
					.get(uri2 + "/static/images/gov.uk_logotype_crown.png?0.12.0"),
				http("request_52")
					.get(uri2 + "/static/javascripts/govuk-template.js?0.12.0")
					.headers(headers_5),
				http("request_53")
					.get(uri2 + "/static/javascripts/application.js")
					.headers(headers_5),
				http("request_54")
					.get(uri2 + "/static/stylesheets/external-links/external-link.png?0.12.0"),
				http("request_55")
					.get(uri2 + "/static/stylesheets/images/open-government-licence.png?0.12.0"),
				http("request_56")
					.get(uri2 + "/static/stylesheets/images/govuk-crest.png?0.12.0"),
				http("request_57")
					.get(uri2 + "/static/images/breadcrumb-separator.png")))
			.pause(minIdleTime milliseconds, maxIdleTime milliseconds)
			.exec(http("request_62")
			.get("/suppliers/services/5958282199957504/edit/description")
			.headers(headers_30)
			.resources(http("request_63")
			.get(uri2 + "/static/stylesheets/govuk-template.css?0.12.0")
			.headers(headers_1),
				http("request_64")
					.get(uri2 + "/static/stylesheets/fonts.css?0.12.0")
					.headers(headers_1),
				http("request_65")
					.get(uri2 + "/static/stylesheets/application.css")
					.headers(headers_1),
				http("request_66")
					.get(uri2 + "/static/images/gov.uk_logotype_crown.png?0.12.0"),
				http("request_67")
					.get(uri2 + "/static/javascripts/govuk-template.js?0.12.0")
					.headers(headers_5),
				http("request_68")
					.get(uri2 + "/static/javascripts/application.js")
					.headers(headers_5),
				http("request_69")
					.get(uri2 + "/static/stylesheets/govuk-template-print.css?0.12.0")
					.headers(headers_1),
				http("request_70")
					.get(uri2 + "/static/images/breadcrumb-separator.png"),
				http("request_71")
					.get(uri2 + "/static/stylesheets/external-links/external-link.png?0.12.0"),
				http("request_72")
					.get(uri2 + "/static/stylesheets/images/open-government-licence.png?0.12.0"),
				http("request_73")
					.get(uri2 + "/static/stylesheets/images/govuk-crest.png?0.12.0")))
			.pause(minIdleTime milliseconds, maxIdleTime milliseconds)
			.exec(http("request_78")
			.post("/suppliers/services/5958282199957504/edit/description")
			.headers(headers_15)
			.formParam("serviceName", "Edited+CHECK+Penetration+Testing")
			.formParam("serviceSummary", "Dionach+are+CHECK+providers+of+manual+penetration+testing+services.+Dionach+will+look+to+bypass+the+security+controls+and+test+the+system%E2%80%99s+resistance+to+attack.+A+comprehensive+and+detailed+report+will+be+provided+outlining+the+issues+identified+and+practical+recommendations+on+how+to+resolve+them.")
			.formParam("csrf_token", "1436788300%23%238f10685871f7099b9419f818a6def59c3d7c4158")
			.resources(http("request_79")
			.get(uri2 + "/static/stylesheets/govuk-template.css?0.12.0")
			.headers(headers_1),
				http("request_80")
					.get(uri2 + "/static/stylesheets/fonts.css?0.12.0")
					.headers(headers_1),
				http("request_81")
					.get(uri2 + "/static/stylesheets/application.css")
					.headers(headers_1),
				http("request_82")
					.get(uri2 + "/static/images/gov.uk_logotype_crown.png?0.12.0"),
				http("request_83")
					.get(uri2 + "/static/stylesheets/govuk-template-print.css?0.12.0")
					.headers(headers_1),
				http("request_84")
					.get(uri2 + "/static/javascripts/govuk-template.js?0.12.0")
					.headers(headers_5),
				http("request_85")
					.get(uri2 + "/static/javascripts/application.js")
					.headers(headers_5),
				http("request_86")
					.get(uri2 + "/static/images/breadcrumb-separator.png"),
				http("request_87")
					.get(uri2 + "/static/stylesheets/external-links/external-link.png?0.12.0"),
				http("request_88")
					.get(uri2 + "/static/stylesheets/images/open-government-licence.png?0.12.0"),
				http("request_89")
					.get(uri2 + "/static/stylesheets/images/govuk-crest.png?0.12.0")))
	}
	setUp(scn.inject(atOnceUsers(numberOfUsers)).protocols(httpProtocol))
}