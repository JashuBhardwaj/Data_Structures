import java.util.*;
public class BubbleSort {
	
public static void print(int arr[]) {
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		
	}

	public static void sort(int arr[]) {
		
		int temp=0;
		int n=arr.length-1;
			while(n>0) {
				
				for(int i=0;i<arr.length-1;i++) {
					if(arr[i]>arr[i+1])
					{
						temp=arr[i+1];
						arr[i+1]=arr[i];
						arr[i]=temp;
						
					}
				}
				n--;
				
			}
		
		
	}
	

	public static void main(String[] args) {
		
				Scanner sc=new Scanner(System.in);
				int n=sc.nextInt();
				int arr[]=new int[n];
				for(int i=0;i<n;i++) {
					arr[i]=sc.nextInt();
				}
				
				sort(arr);
				print(arr);

	}

}
