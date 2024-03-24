package com.example.demo.controller;

import java.util.List;

import lombok.Data;

@Data
@Template(path = "user/list")
public class UserListForm implements SearchForm<UserFindEntity, UserSearchParams> {

	private UserSearchParams searchParams;
	private List<UserFindEntity> searchResults;
}
