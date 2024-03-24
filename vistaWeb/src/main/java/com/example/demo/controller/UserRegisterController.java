package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/userRegister")
public class UserRegisterController {

	@GetMapping()
	@ResponseBody
	public String home() {
		return "こんなどうでもいい仕事に時間を使っている場合ではない";
	}

	@GetMapping("/create")
	@ResponseBody
	public String create() {
		return "登録";
	}

	@GetMapping("/read")
	@ResponseBody
	public String read() {
		return "表示";
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
