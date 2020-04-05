
public class PartitionSort {
     
	public static int Partition(int []a,int p, int r)
	{
		int pivot=a[r];
		int i=p-1;int temp=0;
		for(int j=p;j<=r-1;j++)
		{
			if(a[j]<pivot)
			{
				i++;
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		temp=a[i+1];
		a[i+1]=pivot;
		a[r]=temp;
		return i+1;
	}
	public static void Quicksort(int[]a,int p,int r)
	{
		if(p<r)
		{
			int q= Partition(a,p,r);
			Quicksort(a,p,q-1);
			Quicksort(a,q+1,r);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[]a={10,5,12,2,11,1};
		 int p=0;int r=5;
		 Quicksort(a,p,r);
		 for(int i=0;i<a.length;i++)
		 {
			 System.out.println(a[i]);
		 }
	}

}
