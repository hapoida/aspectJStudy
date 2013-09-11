package co.kr.skmns.aspect;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import co.kr.skmns.component.MyBean;

@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class TestAspejctJ {
	
	@Test
	public void test_aspectj_before_after_기능동작확인(){
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:co/kr/skmns/aspect/TestAspejctJ-context.xml");
		
		ctx.refresh();
		
		MyBean bean = (MyBean)ctx.getBean("myBean");
		
		System.out.println("-----bean-----");
		bean.run();
	}
}
