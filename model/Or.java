package model;

public class Or extends Gate{
	public int or(int a,int b) {
		if(a==1 || b==1) {
			return 1;
		}else {
			return 0;
		}
	}
	public int or(int a,int b,int c) {
		if(a==1 || b==1 || c==1) {
			return 1;
		}else {
			return 0;
		}
	}
}
