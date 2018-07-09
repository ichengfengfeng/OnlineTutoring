package com.icff.tutoring.controller.back;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.icff.tutoring.dto.Page;
import com.icff.tutoring.po.Area;
import com.icff.tutoring.service.IBaseManagerServiec;
import com.icff.tutoring.service.IuserService;
import com.icff.tutoring.util.Log;

@Controller
@RequestMapping("admin")
public class AreaManagerController {
	@Autowired
	private IBaseManagerServiec baseManagerService;
	@Autowired
	private IuserService userService;
	@RequestMapping(value="/area/init",method=RequestMethod.GET)
	public String init(Model model,@RequestParam(value = "currentpage",required=false,defaultValue="1")int currentpage) {
		int maxCount;
		try {
			maxCount = baseManagerService.queryCountArea();
			Page page = new Page(currentpage, 10, maxCount);
			List<Area> areas = baseManagerService.getAllArea(page);
			model.addAttribute("areas", areas);
			model.addAttribute("page", page);
		} catch (Exception e) {
			Log.logger.error("可授课分类维护页面初始化失败");
			e.printStackTrace();
			return "error.jsp";
		}
		
		return "back/areaManager.jsp";
	}
	@RequestMapping("/area/addinit")
	public String addinit(Model model) {
		try {
			List<Area> areas= userService.getSuperArea();
			model.addAttribute("areas", areas);
		} catch (Exception e) {
			e.printStackTrace();
			return "error.jsp";
		}
		return "back/addArea.jsp";
	}
	@RequestMapping(value="/area/add",method=RequestMethod.POST)
	public @ResponseBody String addTutorclassType(Area area) {
		try {
			int count = baseManagerService.insertArea(area);
			if(count>0)
				return "success";
		} catch (Exception e) {
			e.printStackTrace();
			return "error.html";
		}
		return "failed";
	}
	@RequestMapping(value="/area/delete",method=RequestMethod.POST)
	public  String deleteTutorclassTypes(@RequestParam(value="id[]",required=false) int[] id,int currentpage) {
		if(id==null || id.length<1) 
			return "redirect:init?currentpage="+currentpage;
		try {
			baseManagerService.deleteAreas(id);
		} catch (Exception e) {
			Log.logger.error("批量删除可授课类型失败");
			e.printStackTrace();
		}
		return "redirect:init?currentpage="+currentpage;
	}

}
