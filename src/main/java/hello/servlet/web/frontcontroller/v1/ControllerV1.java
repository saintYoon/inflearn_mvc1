package hello.servlet.web.frontcontroller.v1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface ControllerV1 {
    //회원 폼 저장, 조회하는 컨트롤러
    void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
