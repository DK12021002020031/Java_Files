package day_5;

public class Binary_Search {

	public static void main(String[] args) {
		
		int[] arr= {10,20,30,40,50,60,70,80,90};
		
		int target=160;
		
		int low=0,high=arr.length-1,flag=0;
		
		while(low<=high) {
			
			int mid=low+(high-low)/2;
			
			if(arr[mid]==target) {
				
				System.out.println(target+" is found!");
				flag=1;
				break;
			}
			
			else if(target<arr[mid]) {
				
				high=mid-1;
			}
			else {
				
				low=mid+1;
			}
		}
		
		if(flag==0) System.out.println(target+" not found!");

	}

}
