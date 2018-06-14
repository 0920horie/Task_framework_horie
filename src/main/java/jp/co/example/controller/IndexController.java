package jp.co.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.example.entity.Form;

@Controller
public class IndexController {


	@RequestMapping("/login")
	public String login (@ModelAttribute("login") Form form, Model model) {

			return "login";
	}

}
