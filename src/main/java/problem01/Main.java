package problem01;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] arr = { -10, -3, 5, 6, -20 };
		findMaxProduct(arr);
	}

	public static void findMaxProduct(int[] arr) {
		//
		// 코드를 완성 하십시오.
		//
		int a=0;
		int b=0;
		int max = a*b;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<i;j++) {
				if(max < arr[i]*arr[j]) {
					max = arr[i]*arr[j];
					a=arr[j];
					b=arr[i];
				}
			}
		}
		Object[] result = {a,b};
			System.out.println(Arrays.deepToString(result));
		
	}
}
