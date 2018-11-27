package com.dfw.framework.index;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/index")
public class IndexController {
	
	@Autowired
	private IndexService indexService;
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public ModelAndView test(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("/index/index");
		return mav;
	}
	@RequestMapping(value = "/test2", method = {RequestMethod.GET,RequestMethod.POST}, produces = "application/json; charset=utf-8")
	@ResponseBody
	public ModelAndView test2(HttpServletRequest request) {
		indexService.test2();
		ModelAndView mav = new ModelAndView("/index/index");
		return mav;
	}
}
