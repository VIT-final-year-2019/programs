
public class MergeSort {
     public static void mergeSort(int[]a,int p,int r)
     {int q=0;
    	 if(p<r)
    	 {
    		 q=(p+r)/2;
    		 mergeSort(a,p,q);
    		 mergeSort(a,q+1,r);
    		 simpleMerge(a,p,q,r);
    	 }
     }
     public static void simpleMerge(int[]a,int p,int q,int r)
     {
    	int []l=new int[q-p+2];int x=q-p+1;
    	int[]r1=new int[r-q+1];int y=r-q;
    	l[q-p+1]=1000;
    	r1[r-q]=1000;int c=0,d=0;
    	for(int j=0;j<x;j++)
    	{
    		l[j]=a[p+j];
    		
    	}
    	
    	
    	for(int i=0;i<y;i++)
    	{
    		r1[i]=a[q+1+i];
    	}
    	
    	
    	
    	for(int i=p;i<=r;i++)
    	{
    		if(l[c]<r1[d] )
    		{
    			a[i]=l[c];
    			//System.out.println(a[i]);
    			if(c<(l.length-1))
    			c++;
    		}
    		else
    		{
    			a[i]=r1[d];
    		//	System.out.println(a[i]);
    			if(d<(r1.length-1))
    			d++;
    		}
    		
    	}
    	
    	 
     }
	public static void main(String[] args) {
		 int[]a={10,5,12,2,11,1};int n=6;int p=0;int q=5;int r=8;
		 mergeSort(a,p,q);
		 //simpleMerge(a,p,q,r);
		for(int i=0;i<a.length;i++)
		 {
			System.out.println(a[i]);
		 }

	}

}
