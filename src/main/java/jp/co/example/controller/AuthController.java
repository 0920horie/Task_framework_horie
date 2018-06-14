package jp.co.example.controller;

import org.springframework.stereotype.Controller;


@Controller
	public class AuthController {

//	@Autowired
//	private UserService userService;
//
//	@Autowired
//	private IndexService indexService;
//
//	@RequestMapping("/list")
//	public String list(Model model) {
//		List<User> list = userService.findAll();
//		model.addAttribute("userlist", list);
//
//		return "list";
//	}
//
//	@RequestMapping(value="/menu", method=RequestMethod.GET)
//	public String menu (Model model) {
//
//		return "menu";
//	}
//
//	@RequestMapping(value="/menu", method=RequestMethod.POST)
//	public String loginCheck (@Validated @ModelAttribute("login") Form form,
//			BindingResult bindingResult, HttpSession session, Model model) {
//
//		if (bindingResult.hasErrors()) {
//			return "login";
//		}
//
//		jp.co.example.entity.Admin ad = indexService.getAdmin(form.getId(), form.getPass());
//
//		if (ad == null) {
//			model.addAttribute("msg", "IDまたはPASSが間違っています");
//			return "login";
//		}
//		session.setAttribute("Admin_name", ad.getAdmin_name());
//
//		return "menu";
//	}

}
