package Day12;

import java.util.Arrays;

import review_Day2.ArrayFunc;

public class StaticEx {
	
	public static void main(String[] args) {
        int [] array1 = {1,5,7,9};
        int [] array2 = {3,6,-1,100,77};
        int [] array3 = ArrayFunc .concat(array1, array2);
        System.out.println(Arrays.toString(array3));
    }
}
