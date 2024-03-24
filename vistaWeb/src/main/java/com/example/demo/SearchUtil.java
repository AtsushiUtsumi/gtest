package com.example.demo;

import java.util.ArrayList;
import java.util.List;

//public interface SearchUtil<E extends FindEntity, K extends SearchParams> {
//	public default List<E> search(K searchParams) {// interfaceはデフォルトを設定できる!!
//		return new ArrayList<E>();
//	}
//}

public class SearchUtil<E extends FindEntity, K extends SearchParams> {
	public List<E> search(K searchParams) {
		return new ArrayList<E>();
	}
}