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
import com.icff.tutoring.po.Grade;
import com.icff.tutoring.service.IBaseManagerServiec;
import com.icff.tutoring.util.Log;

@Controller
@RequestMapping("admin")
public class GradeManagerController {
	@Autowired
	private IBaseManagerServiec baseManagerService;
	@RequestMapping(value = "/grade/init",method=RequestMethod.GET)
	public String init(Model model,@RequestParam(value = "currentpage",required=false,defaultValue="1")int currentpage) {
		try {
			int maxCount = baseManagerService.queryCountGrade();
			Page page = new Page(currentpage, 10, maxCount);
			List<Grade> grades = baseManagerService.getAllGrade(page);
			model.addAttribute("page", page);
			model.addAttribute("grades", grades);
			
		} catch (Exception e) {
			Log.logger.error("加载学员所在年级信息表失败");
			e.printStackTrace();
			return "error.html";
		}
		return "back/gradeManager.jsp";
	}
	@RequestMapping("grade/delete")
	public String deleteGrades(@RequestParam(required=false,name="id[]")int[] id,int currentpage) {
		if(id==null || id.length<1) 
			return "redirect:init?currentpage="+currentpage;
		try {
			baseManagerService.deleteGrades(id);
		} catch (Exception e) {
			Log.logger.error("批量删除可授课类型失败");
			e.printStackTrace();
		}
		return "redirect:init?currentpage="+currentpage;
	}
	@RequestMapping("/grade/addinit")
	public String addinit(Model model) {
		return "back/addGrade.jsp";
	}
	@RequestMapping(value="/grade/add",method=RequestMethod.POST)
	public @ResponseBody String addTutorclassType(Grade grade) {
		try {
			int count = baseManagerService.insertGrade(grade);
			if(count>0)
				return "success";
		} catch (Exception e) {
			e.printStackTrace();
			return "error.html";
		}
		return "failed";
	}

}
