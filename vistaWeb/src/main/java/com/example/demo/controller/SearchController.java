package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.FindEntity;
import com.example.demo.SearchParams;
import com.example.demo.SearchUtil;

// ひょっとして「interface」「class」「abstract class」をジェネリクスの型パラメータに渡した時の違いを理解していない?

@Controller
// @Table("")をパクる
public abstract class SearchController<F extends SearchForm<E, K>, E extends FindEntity, K extends SearchParams> {

	@PostMapping("pageChange")
	public String pageChange(F form, Model model) {
		model.addAttribute("", new ArrayList<E>());
		// TODO: ここでこのコントローラに紐づいているテンプレートファイルのパスを取得する方法を考える
		return this.getClass().toString();
	}

	@GetMapping("/search") // TODO: ここPOSTに変更する
	//@ResponseBody
	public String search(F form, Model model) {
		final String template = form.getTemplate();// これでテンプレートファイルのパスは取れそうや...
		SearchUtil<E, K> util = new SearchUtil<E, K>();
		List<E> searchResults = util.search(form.getSearchParams());
		System.err.println(searchResults.size());
		form.setSearchResults(searchResults);
		return template;

	}
}
