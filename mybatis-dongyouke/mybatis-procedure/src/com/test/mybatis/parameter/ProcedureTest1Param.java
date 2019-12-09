package com.test.mybatis.parameter;

public class ProcedureTest1Param {
	private int num1;
	private int num2;
	private int res;
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int getRes() {
		return res;
	}
	public void setRes(int res) {
		this.res = res;
	}
	@Override
	public String toString() {
		return "ProcedureTest1Param [num1=" + num1 + ", num2=" + num2 + ", res=" + res + "]";
	}
	public ProcedureTest1Param(int num1, int num2, int res) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.res = res;
	}
	public ProcedureTest1Param() {
		super();
	}
	
}
