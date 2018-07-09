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
import com.icff.tutoring.po.Tutorialclasstype;
import com.icff.tutoring.service.IBaseManagerServiec;
import com.icff.tutoring.service.IuserService;
import com.icff.tutoring.util.Log;

@Controller
@RequestMapping("admin")
public class TutortypeManagerController {
	@Autowired
	private IBaseManagerServiec baseManagerService;
	@Autowired
	private IuserService userService;
	
	@RequestMapping(value="/tutortype/init",method=RequestMethod.GET)
	public String init(Model model,@RequestParam(value = "currentpage",required=false,defaultValue="1")int currentpage) {
		int maxCount;
		try {
			maxCount = baseManagerService.queryCountTutorType();
			Page page = new Page(currentpage, 10, maxCount);
			List<Tutorialclasstype> tutorTypes = baseManagerService.getAllTutorClassType(page);
			model.addAttribute("tutorTypes", tutorTypes);
			model.addAttribute("page", page);
		} catch (Exception e) {
			Log.logger.error("可授课分类维护页面初始化失败");
			e.printStackTrace();
			return "error.html";
		}
		
		return "back/tutortypeManager.jsp";
	}
	@RequestMapping("/tutortype/addinit")
	public String addinit(Model model) {
		try {
			List<Tutorialclasstype> tutors=userService.getAllSuperTutorialclasstypes();
			model.addAttribute("tutors", tutors);
		} catch (Exception e) {
			e.printStackTrace();
			return "error.jsp";
		}
		return "back/addTutorclassType.jsp";
	}
	@RequestMapping(value="/tutortype/add",method=RequestMethod.POST)
	public @ResponseBody String addTutorclassType(Tutorialclasstype tutorct) {
		try {
			int count = baseManagerService.insertTutorClassType(tutorct);
			if(count>0)
				return "success";
		} catch (Exception e) {
			e.printStackTrace();
			return "error.html";
		}
		return "failed";
	}
	@RequestMapping(value="/tutortype/delete",method=RequestMethod.POST)
	public  String deleteTutorclassTypes(@RequestParam(value="typeid[]",required=false) String[] typeid,int currentpage) {
		if(typeid==null || typeid.length<1) 
			return "redirect:init?currentpage="+currentpage;
		try {
			baseManagerService.deleteTutorClassTypes(typeid);
		} catch (Exception e) {
			Log.logger.error("批量删除可授课类型失败");
			e.printStackTrace();
		}
		return "redirect:init?currentpage="+currentpage;
	}

}
