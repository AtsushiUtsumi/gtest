package com.example.demo.controller;

import java.util.List;

import com.example.demo.FindEntity;
import com.example.demo.SearchParams;

public interface SearchForm<E extends FindEntity, K extends SearchParams> {
	//private String template = "テンプレートファイルのパス";
	//private K searchParams;// 1画面で複数の検索モードを切り替える、つまり、複数のパラメータクラスを使い分ける場合
	//private List<E> searchResults;
	// ページネーション
	public default String getTemplate() {
		Template ann = this.getClass().getAnnotation(Template.class);
		return ann.path();
	}

	public K getSearchParams();

	public List<E> getSearchResults();

	public void setSearchParams(K searchParams);

	public void setSearchResults(List<E> searchResults);
}
