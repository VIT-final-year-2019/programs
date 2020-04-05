
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[]arr={10,5,12,2,11,1};int n=6;int p=0;int i=0;int key=0;
      for(int j=1;j<6;j++)
      {
    	 i=j-1; key=arr[j];
    	 while(i>=0 && key<arr[i] )
    	 {
    		 arr[i+1]=arr[i];
    		 i=i-1;
    	 }
    	 arr[i+1]=key;
    	 
      }
      for(int k:arr)
    	  System.out.print(k+" ");
	}

}
