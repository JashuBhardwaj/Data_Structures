import java.util.*;
public class MergeSort {
	
	public static void mergesort(int arr[],int s,int end) {
		if(s==end)
			return ;
		int m=(s+end)/2;
		mergesort(arr,s,m);
		mergesort(arr,m+1,end);
		merge(arr,s,end);
		
	}
	
	
	public static void merge(int arr[],int s,int end) {
		int ans[]=new int[end-s+1];
		int i=s;
		int k=0;
		int m=(s+end)/2;
		int j=m+1;
		while(i<=m && j<=end) {
			if(arr[i]<arr[j]) {
				ans[k]=arr[i];
				i++;
			}
				
			else {
				ans[k]=arr[j];
				j++;
			}
			
			k++;
				
		}
		
		while(i<=m) {
			ans[k]=arr[i];
			i++;k++;
		}
		
		while(j<=end) {
			ans[k]=arr[j];
			j++;k++;
		}
		k=0;
		
		while(k<ans.length) {
			arr[s+k]=ans[k];
			k++;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int s=0;
		mergesort(arr,s,n-1);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " " );
		}

	}

}
