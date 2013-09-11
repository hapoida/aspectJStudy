package co.kr.skmns;

import org.springframework.beans.factory.annotation.Autowired;

import co.kr.skmns.ExampleService;
import junit.framework.TestCase;

public class ExampleServiceTests extends TestCase {


	@Autowired Service service = new ExampleService();
	
	public void testReadOnce() throws Exception {
		assertEquals("Hello world!", service.getMessage());
	}

}
