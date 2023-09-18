package com.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.dto.LoginDTO;

@Component("xxx")
public class MyHandlerInterceptor extends HandlerInterceptorAdapter {

	//prehandle : a.가로채기
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// 기능: request 이용해서 특별한 작업 수행 => 로그인 여부 확인
		System.out.println("MyHandlerInterceptor.preHandle");
		
		// 로그인 체크 여부 확인
		HttpSession session = request.getSession();
		LoginDTO dto = (LoginDTO)session.getAttribute("login");
		if(dto==null) {
			response.sendRedirect("/app/loginForm");  //절대경로
			return false;  // 로그인 안했을땐 dto가 null => Controller로 안넘어가고 리다이렉트됨
		}
		
		return true;   // true로 줘야 Controller로 넘어갈 수 있음
	}

	//postHandle : b.가로채기
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// 기능: response 및 ModelAndView 이용해서 특별한 작업 수행 => ModelAndView 이용해서 view 정보 변경 작업 가능
		System.out.println("MyHandlerInterceptor.postHandle");
	}

	//afterHandle : c.가로채기
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("MyHandlerInterceptor.afterHandle");
	}

}
