package org.ZohoSchoolGraduateTraining;

import java.util.Arrays;

public class ArrayAlgorithm {
	public static void main(String[] args) {

		int[] arr= {5,6,4,2,8};
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]> arr[j]) {
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		 int n = arr.length;
	        for (int i = 0; i < n; i++)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	        Arrays.sort(arr);
	}

}
