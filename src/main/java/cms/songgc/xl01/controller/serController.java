package cms.songgc.xl01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class serController {

	@RequestMapping("holler")
	public String toholler() {
		
		return "list";
		
	}
}