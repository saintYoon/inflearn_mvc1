package hello.servlet;

import hello.servlet.web.springmvc.v1.SpringMemberFormControllerV1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;

@ServletComponentScan	//현재부터 하위패키지를 찾아서 서블릿으로 등록해줌(Servlet auto scan)
@SpringBootApplication
public class ServletApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServletApplication.class, args);
	}
/*
	@Bean
	SpringMemberFormControllerV1 springMemberFormControllerV1(){
		return new SpringMemberFormControllerV1();
	}

 */

}
