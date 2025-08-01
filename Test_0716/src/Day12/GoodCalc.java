package Day12;

import review_Day2.ArrayFunc;

public class GoodCalc extends Calculator {

	@Override
	public int add(int a, int b) { // 추상 메소드 구현
		return a + b;
	}

	@Override
	public int subtract(int a, int b) { // 추상 메소드 구현
		return a - b;
	}

	@Override
	public double average(int[] a) { // 추상 메소드 구현
		return ArrayFunc.avg(a);
	}

}
