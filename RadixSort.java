
public class RadixSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[]a={492,629,127,555,161,786,941,380};
      int []c=new int[10];
      int[][]bucket=new int[8][10];
      int e=1;int digit=0;int z=0;
      
      //System.out.println(bucket[].length );
      for(int i=0;i<3;i++)
      {
    	  for(int k=0;k<10;k++)
    	  {
    		  c[k]=-1;
    		  //System.out.print(c[k]);
    	  }
    	//System.out.println();
    	  for(int j=0;j<a.length;j++)
    	  {
    		  digit=(a[j]/e)%10;
    		  c[digit]++;
    		  bucket[c[digit]][digit]=a[j];
    	  }
    	  
    	  e=e*10;z=0;
    	  for(int k=0;k<10;k++)
          {
    		  if(c[k]!=-1)
        	  for(int l=0;l<=c[k];l++)
        	  {    if(z<a.length)
        		  a[z]=bucket[l][k];z++;
        	  }
          }
      }
      
      for(int n=0;n<a.length;n++)
      {
    	  System.out.println(a[n]);
      }
		
	}

}
