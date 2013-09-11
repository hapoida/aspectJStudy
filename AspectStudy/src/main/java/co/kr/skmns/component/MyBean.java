package co.kr.skmns.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("myBean")
public class MyBean {
	
	@Autowired private MyDependency dependency;
	
	public void run(){
		dependency.hello(5919);
		dependency.hello(4790);
		dependency.goodbye();
	}
}
