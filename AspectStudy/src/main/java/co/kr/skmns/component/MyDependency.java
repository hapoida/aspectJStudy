package co.kr.skmns.component;

import org.springframework.stereotype.Component;

@Component("myDependency")
public class MyDependency {
	
	public void hello(int intValue){
		System.out.println("ehllo... OnJ " + intValue);
	}
	
	public void goodbye(){
		System.out.println("goodbyte.. Onj");
	}
}
