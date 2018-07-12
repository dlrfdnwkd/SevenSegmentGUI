package model;

public class Xor extends Gate{
	public int xor(int a,int b) {
		if(a==b) {
			return 0;
		}else {
			return 1;
		}
		//return a^b;
	}
}
