package com.example.demo;

// 検索条件DTOは必ずこのクラスを継承すること
public interface SearchParams {

	public String toLogString();

	public String toQuery();
}
