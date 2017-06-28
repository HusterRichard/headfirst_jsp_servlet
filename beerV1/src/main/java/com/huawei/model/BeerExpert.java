package com.huawei.model;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
	public List<String> getBrands(String color) {
		List<String> lstBrand = new ArrayList<String>();
		if ("amber".equals(color)) {
			lstBrand.add("Jack Amber");
			lstBrand.add("Red Moose");
		} else {
			lstBrand.add("Jail Pale Ale");
			lstBrand.add("Gout Stout");
		}
		
		return lstBrand;
	}
}
