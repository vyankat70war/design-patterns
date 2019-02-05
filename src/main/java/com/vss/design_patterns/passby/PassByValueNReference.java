package com.vss.design_patterns.passby;

public class PassByValueNReference {

	private Integer i;

	public void setVal(Integer i) {
		i = 5;
		this.i = i;
	}
	
	public static void main(String[] args) {
		PassByValueNReference n = new PassByValueNReference();
		Integer val =4;
		n.setVal(val);
		System.out.println(n.i);
		System.out.println(val);
	}

}
