package model;

public class NotGate extends Gate{
	public int not(int x) {
		if(x==0) {
			return 1;
		}else {
			return 0;
		}
	}
}
