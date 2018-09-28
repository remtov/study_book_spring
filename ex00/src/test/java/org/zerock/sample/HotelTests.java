package org.zerock.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class HotelTests {

	@Setter(onMethod_ = { @Autowired })
	private SampleHotel hotel;

	@Test
	public void testExist() {

		assertNotNull(hotel);

		log.info(hotel);
		log.info("---------------------------");
		log.info(hotel.getChef());

	}

}
/* 결과
INFO : org.springframework.test.context.support.DefaultTestContextBootstrapper - Loaded default TestExecutionListener class names from location [META-INF/spring.factories]: [org.springframework.test.context.web.ServletTestExecutionListener, org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener, org.springframework.test.context.support.DependencyInjectionTestExecutionListener, org.springframework.test.context.support.DirtiesContextTestExecutionListener, org.springframework.test.context.transaction.TransactionalTestExecutionListener, org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener]
INFO : org.springframework.test.context.support.DefaultTestContextBootstrapper - Using TestExecutionListeners: [org.springframework.test.context.web.ServletTestExecutionListener@604ed9f0, org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener@6a4f787b, org.springframework.test.context.support.DependencyInjectionTestExecutionListener@685cb137, org.springframework.test.context.support.DirtiesContextTestExecutionListener@6a41eaa2]
INFO : org.springframework.beans.factory.xml.XmlBeanDefinitionReader - Loading XML bean definitions from URL [file:src/main/webapp/WEB-INF/spring/root-context.xml]
INFO : org.springframework.context.support.GenericApplicationContext - Refreshing org.springframework.context.support.GenericApplicationContext@6fc6f14e: startup date [Fri Sep 28 11:01:49 KST 2018]; root of context hierarchy
INFO : org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor - JSR-330 'javax.inject.Inject' annotation found and supported for autowiring
INFO : org.zerock.sample.HotelTests - SampleHotel(chef=Chef())
INFO : org.zerock.sample.HotelTests - ---------------------------
INFO : org.zerock.sample.HotelTests - Chef()
INFO : org.springframework.context.support.GenericApplicationContext - Closing org.springframework.context.support.GenericApplicationContext@6fc6f14e: startup date [Fri Sep 28 11:01:49 KST 2018]; root of context hierarchy

*/