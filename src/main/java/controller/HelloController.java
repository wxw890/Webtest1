package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller {//Controller가 불려졌을때 handleRequest메서드가 자동으로 불러진다.(하지만 자식클래스를 사용하지 Controller를 직접적으로 상속해서 사용하진 않음)

	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		
		return new ModelAndView("hello.jsp"); //이동하고 싶은 페이지
	}

}
