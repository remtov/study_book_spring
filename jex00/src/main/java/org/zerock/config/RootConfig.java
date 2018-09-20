package org.zerock.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration//해당클레스의 인스턴스를 이용해서 설정파일을 대신한다.
@ComponentScan(basePackages= {"org.zerock.sample"})
public class RootConfig {//root-context.xml의 역할을 대신한다.
	

}
