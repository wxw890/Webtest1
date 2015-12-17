package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class absController extends AbstractController {//Controller인터페이스 보단 주로 AbstractController를 상속하여 사용한다.
														//AbstractController 클래스 안에 supportedMethods 메소드를 정의 되어있어 사용할 수있다.
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		return new ModelAndView("absControllerResult.jsp");
	}

}
