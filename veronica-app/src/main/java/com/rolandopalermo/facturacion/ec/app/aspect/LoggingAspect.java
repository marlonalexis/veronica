package com.rolandopalermo.facturacion.ec.app.aspect;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	private static Logger logger = LogManager.getLogger(LoggingAspect.class.getName());

	@Pointcut("@annotation(org.springframework.web.bind.annotation.PostMapping)")
	public void createOperation() {
	}

	// @Pointcut("execution(* *.*(..))")
	// protected void allMethod() {
	// }
	//
	@Pointcut("execution(public * *(..))")
	protected void allPublicOperation() {
	}
	//
	// @Pointcut("execution(* *.*(..))")
	// protected void loggingAllOperation() {
	// }

	// @Before("restController() && allMethod() && args(..,request)")
//	@Before("createOperation() && allPublicOperation()")
//	public void logBefore(JoinPoint joinPoint) throws IOException {
//		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes())
//				.getRequest();
//		System.out.println("=============== request ===============");
//		System.out.println("Entering in Method :  " + joinPoint.getSignature().getName());
//		System.out.println("Class Name :  " + joinPoint.getSignature().getDeclaringTypeName());
//		System.out.println("Arguments :  " + Arrays.toString(joinPoint.getArgs()));
//		System.out.println("Target class : " + joinPoint.getTarget().getClass().getName());
//		if (null != request) {
//			System.out.println("Start Header Section of request ");
//			System.out.println("Method Type : " + request.getMethod());
//			Enumeration headerNames = request.getHeaderNames();
//			while (headerNames.hasMoreElements()) {
//				String headerName = (String) headerNames.nextElement();
//				String headerValue = request.getHeader(headerName);
//				System.out.println("Header Name: " + headerName + " Header Value : " + headerValue);
//			}
//			System.out.println("Request Path info :" + request.getServletPath());
//			System.out.println("End Header Section of request ");
//		}
//		System.out.println("=============== request ===============");
//	}

}