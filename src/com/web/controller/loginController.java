package com.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


public class loginController implements Controller{
	@Override
	public ModelAndView handleRequest(HttpServletRequest request,HttpServletResponse respone)throws Exception{
		 //1���ռ���������֤����  
	     //2���󶨲������������  
	     //3�������������ҵ��������ҵ����  
	     //4��ѡ����һ��ҳ��  
	     //ModelAndView mv = new ModelAndView();  
	     //���ģ������ �����������POJO����  
	     //mv.addObject("message", "Hello World!");  
	     //�����߼���ͼ������ͼ����������ݸ����ֽ������������ͼҳ��  
	     //mv.setViewName("hello");  
	     //return mv;
		respone.getWriter().write("hello waorld");
		return null;
	}	
}
