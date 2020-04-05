
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[]arr={10,5,12,2,11,1};int n=6;int min=0;int temp,j=0;int p=0;int r=0;int x=0;
      for(int i=0;i<n-1;i++)
      {
    	  min=arr[i];p=i;j=i+1;x=0;
    	  while(j<n)
    	  {
    		  if(arr[j]<min){
    		  min=arr[j];
    		  r=j;x++;}
    		  
    		  
    		  j++;
    	  }
    	if(x!=0){
    	  temp=arr[p];
    	  arr[p]=min;
    	  arr[r]=temp;}
    	  
      }
      for(int k:arr)
      {
    	  System.out.println(k);
      }
	}

}
