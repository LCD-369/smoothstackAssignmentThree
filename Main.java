package com.louis;


public class Main {

	public static void main(String[] args) {
		
		int[][] arr = {{3, 5} ,{7, 4}, {7, 7}, {3, 1}, {8, 2}, {2, 4}};
		int max = 1;
		int y = 1;
		int x = 1;
		for(int i=0; i<arr.length; i++) {
					
	        for(int j=0; j<arr[i].length; j++) {
	        	
	        	if(arr[i][j] > max){
					max = arr[i][j];
					x = i;
					y = j;
				}	
	        }
		}
		
		System.out.println("Max value: "+max);
	
		System.out.println("Max value position: "+x+", "+y);  
	}

}
