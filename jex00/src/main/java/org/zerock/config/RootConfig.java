package org.zerock.config;

import javax.activation.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration // 해당클레스의 인스턴스를 이용해서 설정파일을 대신한다.
@ComponentScan(basePackages = { "org.zerock.sample" }) /* xml로 설정된 내용은 이어노테이션으로 처리할 수 있다. */
public class RootConfig {// root-context.xml의 역할을 대신한다.

	@Bean
	public DataSource dataSource() {
		HikariConfig hikariConfig = new HikariConfig();
		hikariConfig.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		hikariConfig.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:xe");
		hikariConfig.setUsername("ictu");
		hikariConfig.setPassword("12345678");

		HikariDataSource dataSource = new HikariDataSource(hikariConfig);

		return dataSource;
	}
}
