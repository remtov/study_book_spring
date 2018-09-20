package org.zeorct.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Component //해당 클래스가 스프링에서 관리해야하는 대상임을 표시한다.
@Data
public class Restaurant {
	@Setter(onMethod_ = @Autowired)// setCHef()를 컴파일시에 생성해준다.
	//onMethod는 setCHef()에 와이어드어노테이션을 추가할수있게 해준다
	private Chef chef;
}
