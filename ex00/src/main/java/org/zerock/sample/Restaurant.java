package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Component // 앱서블릿root-context.xml의 설정에의해 이 클래스의 인스턴스의 메모리가 생성된다.
@Data
public class Restaurant {

	@Setter(onMethod_ = @Autowired) // 셰프가 필요하다는 autowired 의존성을 표시를 어노테이션을 통해 해주었으므로 스프링은 셰프의 래퍼런스를 이클래스의 객체에 주입한다.
	private Chef chef;
}
