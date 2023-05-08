package com.docmall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.docmall.domain.UserVO;
import com.docmall.service.UserService;

@RequestMapping("/user/*")
@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	//회원가입 폼
	@GetMapping("/join")
	public void join() {
		
	}
	
	//회원정보저장
	@PostMapping("/join_ok")
	public String join_ok(UserVO vo, RedirectAttributes rttr) {
		
		if(vo.getGender().equals("male")) {
			vo.setGender("남성");
		}else {
			vo.setGender("여성");
		}
		
		
		userService.insert(vo);
		
		return "redirect:/user/joininfo";
	}
	
	//회원정보조회
	@GetMapping("/joininfo")
	public void joininfo(Model model) {
		
		UserVO vo = userService.joininfo();
		
		model.addAttribute("userVO", vo);
	}
}
