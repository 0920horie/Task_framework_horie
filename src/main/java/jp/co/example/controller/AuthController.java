package jp.co.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
	public class AuthController {

		@Autowired
		private UserService userService;


		@RequestMapping("/list")
		public String list(Model model) {
			List<User> list = userService.findAll();
			model.addAttribute("userlist", list);

			return "list";
		}

		@RequestMapping("/index")
		public String index (Model model) {

				return "index";
		}

		@RequestMapping("/login")
		public String login (@ModelAttribute("login") Form form, Model model) {

				return "login";
		}

		@RequestMapping("/test")
		public String test (Model model) {

				return "index_mvc";
		}

		@RequestMapping(value="/menu", method=RequestMethod.GET)
		public String menu (Model model) {

			return "menu";
		}

		@RequestMapping(value="/menu", method=RequestMethod.POST)
		public String loginCheck (@Validated @ModelAttribute("login") Form form,
				BindingResult bindingResult, HttpSession session, Model model) {

			if (bindingResult.hasErrors()) {
				return "login";
			}

			jp.co.example.entity.Admin ad = loginService.getAdmin(form.getId(), form.getPass());

			if (ad == null) {
				model.addAttribute("msg", "IDまたはPASSが間違っています");
				return "login";
			}
			session.setAttribute("Admin_name", ad.getAdmin_name());

			return "menu";
		}


	}
}
