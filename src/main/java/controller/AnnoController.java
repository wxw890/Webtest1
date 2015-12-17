package controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@Controller //annotation의 Controller을 하면 저번에 배운 Controller를 상속받은것과 같은거다
public class AnnoController {
//앞에서 Controller를 상속받았을때 특정 메소드(ex)handleRequestInternal, handleRequest)를 오버라이딩했었는데 여기서는 내 마음데로 메소드를 만들어도 된다
	@RequestMapping("/annoController.do") //무엇을 요청했는지 알려줘야함
	public String pageMove(){
		return "annoControllerResult.jsp";
	}
	
	@RequestMapping("/annoController2.do")
	public String pageMove2(){
		return "annoControllerResult.jsp";
	}

}
