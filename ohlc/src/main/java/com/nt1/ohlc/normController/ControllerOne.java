package com.nt1.ohlc.normController;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt1.ohlc.classes.HttpReq;

@Controller
public class ControllerOne {

	@RequestMapping("/")
	public String gethome()
	{
		return "Head";
	}
	
	
	

}
