package co.kr.skmns.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
	
	@Pointcut("execution(* *..*hello(int)) && args(intValue)")
	public void helloExec(int intValue){
	}
	
	
	@Pointcut("bean(myDependency*)")
	public void inMyDependency(){}
	
	@Before("helloExec(intValue) && inMyDependency()")
	public void simpleBeforeAdvice(JoinPoint joinPoint, int intValue){
		if(intValue > 5000){
			System.out.println("충고실행 ||| " + joinPoint.getSignature().getDeclaringTypeName());
		}
	}
	
	@Around("helloExec(intValue) && inMyDependency()")
	public Object simpleAroundAdvice(ProceedingJoinPoint joinPoint, int intValue) throws Throwable{
		System.out.println("before advice |||" + joinPoint.getSignature().getDeclaringTypeName() + " , " + joinPoint.getSignature().getName());
		
		Object retVal = joinPoint.proceed();
		System.out.println("afer advice" + joinPoint.getSignature().getDeclaringTypeName() + " , " + joinPoint.getSignature().getName());
		
		return retVal;
	}
	
}
