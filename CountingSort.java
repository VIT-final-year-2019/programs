
public class CountingSort {

	public static void main(String[] args) {
		int[]a={1,4,1,2,7,5,2};
		int []count=new int[10];
		for(int i=0;i<a.length;i++)
		{
			count[a[i]]++;
		}
		
		for(int i=1;i<count.length;i++)
		{
			count[i]=count[i]+count[i-1];
		}
		int[]output=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			output[count[a[i]]-1]=a[i];
			count[a[i]]=count[a[i]]-1;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(output[i]);
		}

	}

}
