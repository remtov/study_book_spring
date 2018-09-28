package org.zerock.persistence;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j // 롬복관련 @Data @Setter 중 하나
public class JDBCTests {

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testConnection() {
		try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ictu", "12345678")) {

			log.info(con);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
}

/*
 * INFO : org.zerock.persistence.JDBCTests -
 * oracle.jdbc.driver.T4CConnection@5b464ce8
 */
