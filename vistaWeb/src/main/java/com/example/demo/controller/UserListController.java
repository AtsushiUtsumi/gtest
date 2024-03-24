package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/userList")
public class UserListController extends SearchController<UserListForm, UserFindEntity, UserSearchParams> {

	@GetMapping()
	public String home() {
		//final ModelGroup mg = new ModelGroup();
		//mg.setModelCd("CD");
		//System.err.println(mg.getModelCd());
		return "user/list";
	}

	@GetMapping("/create")
	@ResponseBody
	public String create() {
		return "登録";
	}

	@GetMapping("/read")
	public String read(UserListForm userListForm, Model model) {
		return this.pageChange(userListForm, model);
	}

	@GetMapping("/update")
	@ResponseBody
	public String update() {
		return "更新";
	}

	@GetMapping("/delete")
	@ResponseBody
	public String delete() {
		return "消去";
	}

	@GetMapping("jojo")
	public String jojo() {
		return "home";
	}
}
