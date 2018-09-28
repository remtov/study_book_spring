package org.zerock.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.config.RootConfig;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class) // 현재 테스트코드가 스프링을 실행하는 역할을 할것이라는 것을 표시
@ContextConfiguration(classes = { RootConfig.class }) // 자바를 이용하는 경우라서 컨텍스트파일경로를 지우고 루트컨피그 클래스를 넣어준다.// 어노테이션과 속성값인 문자열
														// 설정 클래스나 문자열을 사용해서 필요한
														// 객체를 스프링에 등록한다(빈으로 동록된다)ex-
														// classpath:? file:? 로 표기하여
														// root-context.xml의 경로를 지정할수있다.
@Log4j // 롬복을 이용해서 로그를 기록하는 Logger를 변수로 생성한다. 설정파일은 메인리소스폴더와 테스트리소스폴더에 별도로 존재한다
public class SampleTests {

	@Setter(onMethod_ = { @Autowired }) // 의존성주입 샘플테스트는 레스토랑 클래스가 필요하다는 표시
	private Restaurant restaurant;

	@Test // Junit에서 테스트의 대상을 표시한 것
	public void textExist() {
		
		assertNotNull(restaurant);

		log.info(restaurant);
		log.info("--------------------------");
		log.info(restaurant.getChef());

	}
}
/*결과
INFO : org.springframework.test.context.support.DefaultTestContextBootstrapper - Loaded default TestExecutionListener class names from location [META-INF/spring.factories]: [org.springframework.test.context.web.ServletTestExecutionListener, org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener, org.springframework.test.context.support.DependencyInjectionTestExecutionListener, org.springframework.test.context.support.DirtiesContextTestExecutionListener, org.springframework.test.context.transaction.TransactionalTestExecutionListener, org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener]
INFO : org.springframework.test.context.support.DefaultTestContextBootstrapper - Using TestExecutionListeners: [org.springframework.test.context.web.ServletTestExecutionListener@5e3a8624, org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener@5c3bd550, org.springframework.test.context.support.DependencyInjectionTestExecutionListener@91161c7, org.springframework.test.context.support.DirtiesContextTestExecutionListener@604ed9f0]
INFO : org.springframework.context.support.GenericApplicationContext - Refreshing org.springframework.context.support.GenericApplicationContext@2ac273d3: startup date [Fri Sep 28 10:52:09 KST 2018]; root of context hierarchy
INFO : org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor - JSR-330 'javax.inject.Inject' annotation found and supported for autowiring
INFO : org.zerock.sample.SampleTests - Restaurant(chef=Chef())
INFO : org.zerock.sample.SampleTests - --------------------------
INFO : org.zerock.sample.SampleTests - Chef()
INFO : org.springframework.context.support.GenericApplicationContext - Closing org.springframework.context.support.GenericApplicationContext@2ac273d3: startup date [Fri Sep 28 10:52:09 KST 2018]; root of context hierarchy
*/