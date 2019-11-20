package com.aisino.test.aop;

public class MathCalculator implements IMathCalculator {
	
	public int div(int i,int j){
		System.out.println("MathCalculator...div...");
		return i/j;	
	}

	public int div2(int i,int j){
		System.out.println("MathCalculator...div...");
		return i/j;
	}
}

