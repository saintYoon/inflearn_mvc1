package hello.servlet.web.frontcontroller.v2;

import hello.servlet.web.frontcontroller.MyView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface ControllerV2 {
    //회원 폼 저장, 조회하는 컨트롤러
    MyView process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;

}
