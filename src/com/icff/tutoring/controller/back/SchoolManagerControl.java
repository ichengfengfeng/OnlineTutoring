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
import com.icff.tutoring.po.School;
import com.icff.tutoring.service.IBaseManagerServiec;
import com.icff.tutoring.util.Log;

@Controller
@RequestMapping("admin")
public class SchoolManagerControl {
	@Autowired
	private IBaseManagerServiec baseManagerService;
	@RequestMapping(value = "/school/init",method=RequestMethod.GET)
	public String init(Model model,@RequestParam(value = "currentpage",required=false,defaultValue="1")int currentpage) {
		try {
			int maxCount = baseManagerService.queryCountSchool();
			Page page = new Page(currentpage, 10, maxCount);
			List<School> schools = baseManagerService.getSchool(page);
			model.addAttribute("page", page);
			model.addAttribute("schools", schools);
		} catch (Exception e) {
			Log.logger.error("高校信息表失败");
			e.printStackTrace();
			return "error.jsp";
		}
		return "back/schoolManager.jsp";
	}
	@RequestMapping("school/delete")
	public String deleteGrades(@RequestParam(required=false,name="scuuid[]")String[] scuuid,int currentpage) {
		if(scuuid==null || scuuid.length<1) 
			return "redirect:init?currentpage="+currentpage;
		try {
			baseManagerService.deleteSchool(scuuid);
		} catch (Exception e) {
			Log.logger.error("批量删除高校失败");
			e.printStackTrace();
		}
		return "redirect:init?currentpage="+currentpage;
	}
	@RequestMapping("/school/addinit")
	public String addinit(Model model) {
		return "back/addSchool.jsp";
	}
	@RequestMapping(value="/school/add",method=RequestMethod.POST)
	public @ResponseBody String addTutorclassType(School school) {
		try {
			int count = baseManagerService.insertSchool(school);
			if(count>0)
				return "success";
		} catch (Exception e) {
			e.printStackTrace();
			return "error.jsp";
		}
		return "failed";
	}

}
