package com.samil.sma;

import java.sql.Connection;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="file:src/main/webapp/WEB-INF/spring/**/root-context.xml")
public class TestController {
	
	@Inject
	private DataSource dataSource;
	
	private static String namespace = "test";
	
	@Inject
	private SqlSessionFactory sessionFactory;
	
	@Test
	public void testControll() {
		//testStep01();
		//testStep02();
		testStep03();
		//testStep04();
	}
	
	private void testStep01() {
		try(Connection conn = dataSource.getConnection()){
			System.out.println("Step1 : DB Connect Success!!");
		} catch (SQLException e) {
			System.out.println("Step1 : DB Connect Fail!!");
		}
	}
	
	private void testStep02() {
		try(Connection conn = dataSource.getConnection()){
			System.out.println("Step2 : DB Connect Success!!");
		} catch (SQLException e) {
			System.out.println("Step2 : DB Connect Fail!!");
		}
	}
	
	private void testStep03() {
		SqlSession session = sessionFactory.openSession();
		if(session == null) {
			System.out.println("Step3 : DB SqlSession Fail!!");
		}else {
			System.out.println("Step3 : DB SqlSession Success!!");
			System.out.println("value : " + session.selectOne(namespace + ".connectTest").toString());
		}
	}
	
	private void testStep04() {
		//System.out.println(dao.iqryTest().toString());
	}
	
}
