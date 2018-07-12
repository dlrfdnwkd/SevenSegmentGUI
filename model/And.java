package model;
public class And extends Gate{
	public int and(int a,int b) {
		return a*b;
	}
	public int and(int a,int b,int c) {
		return a*b*c;
	}
	public int and(int a,int b,int c,int d) {
		return a*b*c*d;
	}
}
