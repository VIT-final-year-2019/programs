
public class HeapSort {

	public static void heapSort(int[]a,int n)
	{
		int temp=0;
		for(int i=0;i<n/2-1;i++)
		{
			maxHeapify(a,i,n);
		}
		for(int i=n-1;i>=0;i--)
		{
			temp=a[i];
			a[i]=a[0];
			a[0]=temp;
			maxHeapify(a,0,i);
		}
	}
	public static void maxHeapify(int[]a,int largest ,int n )
	{
        int l=2*largest+1;
	    int r=2*largest+2;
	    int i=largest;int temp=0;
	    if(l<n && a[l]>a[largest])
	    {
	    	largest=l;
	    }
	    if(r<n && a[r]>a[largest])
	    {
	    	largest=r;
	    }
	    if(i!=largest)
	    {
	    	temp=a[largest];
	    	a[largest]=a[i];
	    	a[i]=temp;
	    	   maxHeapify(a,largest,n);
	    }
	 
	    
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[]a={4,10,3,5,1};
      heapSort(a,5);
      for(int i=0;i<a.length;i++)
      {
    	  System.out.println(a[i]);
      }
	}

}
