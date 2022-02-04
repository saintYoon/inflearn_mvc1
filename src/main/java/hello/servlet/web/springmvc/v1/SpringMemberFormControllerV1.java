package hello.servlet.web.springmvc.v1;

import hello.servlet.web.frontcontroller.ModelView;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//@Controller
/**
 * spring빈으로 등록하는 동시에 스프링MVC에서 애노테이션 기반 컨트롤러로 인식함
 */
@Component
@RequestMapping //스프링빈으로 등록하는 동시에 컨트롤러 맵에 클래스를 컨트롤러로 등록한다.(클래스레벨에서 해야한다)
public class SpringMemberFormControllerV1 {

    @RequestMapping("/springmvc/v1/members/new-form")   //요청정보를 맵핑한다.
    public ModelAndView process(){
        return new ModelAndView("new-form");

    }

}
