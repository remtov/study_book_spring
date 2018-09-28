package org.zerock.sample;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component//앱서블릿root-context.xml의 설정에의해 이 클래스의 인스턴스의 메모리가 생성된다. 
@Data//Setter생성자toString 자동생성
public class Chef {

}
