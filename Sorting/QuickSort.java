import java.util.*;
public class QuickSort {
	
	
	public static void quicksort(int arr[],int s,int end) {
		
		if(s>=end) {
			return;
		}
		
		int pivot=findpivot(arr,s,end);
		if(pivot==s)
			quicksort(arr,s+1,end);
		else if(pivot==end)
			quicksort(arr,s,end-1);
		else {
			quicksort(arr,s,pivot-1);
			quicksort(arr,pivot+1,end);
		}
			
			}
	
	
	public static int findpivot(int arr[],int s,int end) {
		
		int pivot=arr[s];
		int temp;
		int  pivotindex=0,count=0;
		for(int i=0;i<(end-s+1);i++){
			
			if(pivot>arr[i])
				count++;	
		}
		
			pivotindex=s+count;
			temp=arr[pivotindex];
			arr[pivotindex]=arr[s];
			arr[s]=temp;
			
			
			if(pivotindex==s || pivotindex==end)
				return pivotindex;
			
		
		
		
		// checking that no before pivot are smaller than pivot and no after pivot are greater 
		
		while(s<pivotindex && end>pivotindex) {
			
			if(arr[s]>=pivot) {
				temp=arr[s];
				arr[s]=arr[end];
				arr[end]=temp;
				end--;
				
			}
			
			else {
				s++;
			
			}
			
		}
		
		return pivotindex;
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int s=0;
		quicksort(arr,s,n-1);
		
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		

	}

}
