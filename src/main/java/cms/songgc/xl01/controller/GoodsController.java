package cms.songgc.xl01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cms.songgc.xl01.entity.Goods;
import cms.songgc.xl01.service.GoodsService;

@Controller
public class GoodsController {
		@Autowired
	private GoodsService goodsService;
	
	@RequestMapping("hello")
	public String toholler(Model model) {
		List<Goods> select = goodsService.select();
		
		model.addAttribute("select", select);
		System.out.println(select);
		return "list";
		
	}
}
