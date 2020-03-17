package com.job.coverletter.common.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component	// 스프링 빈으로 인식되기 위한 어노테이션
@Aspect		// Aop
public class LogAop2 {
	private static final Logger logger = LoggerFactory.getLogger(LogAop2.class);
	
	// 매서드 실행 전체를 앞, 뒤로 감싸서 특정한 기능을 실행 할 수 있는 강력한 타입의 Advice >> 리턴 타입이 Object여야 한다
	@Around("execution(* com.job.coverletter..*Controller.*(..))"	
			+ " or execution(* com.job.coverletter..Biz..*Impl.*(..))"
			+ " or execution(* com.job.coverletter..Dao..*Impl.*(..))")
	// Pointcut을 지정하는 문법 (AspectJ 언어 문법을 사용한다)
	public Object logPrint(ProceedingJoinPoint proceedingJoinPint) throws Throwable{
						//  @Around타입의 Advice메서드의 파라미터로 사용되는 인터페이스(JoinPoint의 하위 인테페이스)
		
		
		long start = System.currentTimeMillis();
		
		Object result = proceedingJoinPint.proceed();
									// 다음 Advice를 실행하거나, 실제 target객체의 메서드를 실행하는 기능을 가진 메서드
		
		String type = proceedingJoinPint.getSignature().getDeclaringTypeName();
									// getSignature() : 실행하는 대상 객체의 메서드에 대한 정보를 알고 싶을 때 사용한다.
		String name = "";
		
		if(type.contains("Controller")) {
			name = "Controller : ";
		} else if (type.contains("Biz")) {  //Service
			name = "Biz : ";
		} else if (type.contains("Dao")) {  // DAO
			name = "dao : ";
		}
		long end = System.currentTimeMillis();
		
		logger.info(name + type + "." + proceedingJoinPint.getSignature().getName()+ "()");
		logger.info("Running Time : " + (end - start));
		logger.info("---------------------------------------------------------------------");
		
		return result;
	}
			
			
			

}
