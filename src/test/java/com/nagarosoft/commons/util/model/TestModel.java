package com.nagarosoft.commons.util.model;

import com.nagarosoft.commons.util.annotations.ValidRUC;

public class TestModel {
	
	@ValidRUC
	private String rucTest;

	public String getRucTest() {
		return rucTest;
	}

	public void setRucTest(String rucTest) {
		this.rucTest = rucTest;
	}
}
