package Day6;

public class ValueAndRef {

	void ValueTest(int x){
		x=x+1;
	}
	
	void refTest (int [] arr) {
		arr[2]= 10000;
	}
}
