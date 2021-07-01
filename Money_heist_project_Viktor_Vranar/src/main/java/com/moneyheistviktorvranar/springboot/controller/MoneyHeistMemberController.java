package com.moneyheistviktorvranar.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.moneyheistviktorvranar.springboot.service.HeistMemberService;

@Controller
public class MoneyHeistMemberController {
	
	//display list of MoneyHeistMembers
	
	@Autowired
	private HeistMemberService heistMemberService;
	
	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("listMoneyHeistMembers", heistMemberService.getAllHeistMembers());
		return "index";
	}

}
