import org.junit.Test;


public class Sort {
	
	
//√∞≈›
	public long[] bubbleSort(long[] a)
	{
		long b;
		int m=0;
		int n=0;
		for (int i=a.length-1;i>1;i--)
		{
			for(int j=0;j<i;j++)
			{
				m++;
				if(a[j]>a[j+1])
				{
					b=a[j+1];
					a[j+1]=a[j];
					a[j]=b;	
					n++;
				}
			}
			
		}
		System.out.println("m="+m);
		System.out.println("n="+n);
		return a;
	}
	//—°‘Ò≈≈–Ú
	private long[] selectSort(long[] a)
	{
		int k;
		long b;
		int m=0;
		int n=0;
		for(int i=0;i<a.length-1;i++)
		{   
			k=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[k])
				{
					k=j;
				}
				m++;
			}
			b=a[i];
			a[i]=a[k];
			a[k]=b;
			n++;
		}
		System.out.println("m="+m);
		System.out.println("n="+n);
		return a;
	}
	
	//≤Â»Î≈≈–Ú
	public long[] insertSort(long[] a)
	{
		long b;
		int m=0;
		int n=0;
		for(int i=0;i<a.length;i++)
		{
			b=a[i];
			int j=i;
			while(j>0&&a[j-1]>b)
			{
				m++;
				a[j]=a[j-1];
				j--;
			}
	        a[j]=b;
			/*for(int j=0;j<i;j++)
			{   
				m++;
				if(b<a[j])
				{
					for(int k=i;k>j;k--)
					{
						a[k]=a[k-1];
						n++;
					}
					a[j]=b;
					n++;
					break;
				}
			}*/
		}
		System.out.println("m="+m);
		System.out.println("n="+n);
		return a;
	}
	
	
	//∂˛∑÷≤È’“
	public int find(long searchKey,long[] array)
	{
		int low=0;
		int high=array.length-1;
		while(low<high)
		{
			if(searchKey==array[(low+high)/2])
			{
			    return (low+high)/2;
			}else if(searchKey<array[(low+high)/2])
			{
				high=(low+high)/2;
			}else if(searchKey>array[(low+high)/2])
			{
				low=(low+high)/2;
			}
		}
		return 0;
	}
	//∫∫≈µÀ˛
	public void doTower(int topN,String from,String inter, String to)
	{

		if(topN==1)
		{
			System.out.println("Disk 1 from "+from+" to "+to);
			i++;
		}else
		{
			doTower(topN-1,from,to,inter);
			System.out.println("Disk "+topN+" from "+from+" to "+to);
			i++;
			doTower(topN-1,inter,from,to);
		} 
	}
	
//œ£∂˚≈≈–Ú
	public long[] shellSort(long[] array)
	{
		int inner,outer;
		long temp;
		int h=1;
		while(h<=array.length)
		{
			h=h*3+1;
		}
		while(h>0)
		{
			for(outer=h;outer<array.length;outer++)
			{
				temp=array[outer];
				inner=outer;
				
				while(inner>h-1&&array[inner-h]>temp)
				{
					array[inner]=array[inner-h];
					inner-=h;
				}
				array[inner]=temp;
			}
			h=(h-1)/3;
		}
		return array;
	}
	//∑÷◊Èpartition
	public int partition(int left,int right,long pivot)
	{
		int leftPtr=left-1;
		int rightPtr=right;
		long temp;
		while(true)
		{
			while(array[++leftPtr]>pivot)
			{
				;
			}
			while(rightPtr>0&&array[--rightPtr]<pivot)
			{
				;
			}
			if(leftPtr>=rightPtr)
			{
				break;
			}
			else
			{
				temp=array[leftPtr];
				array[leftPtr]=array[rightPtr];
				array[rightPtr]=temp;
			}
		}
		temp=array[leftPtr];
		array[leftPtr]=array[right];
		array[right]=temp;
		return leftPtr;
	}
	
	//øÏÀŸ≈≈–Ú
	public void quickSort(int left,int right)
	{
		if(right<=left)
		{
			return;
		}else{
			long povit=array[right];
//			System.out.println("a="+povit);
			int mid=partition(left,right,povit);
//			int mid=partition(array,left,right,array[right]);
//			System.out.println("b="+array[right]);
			quickSort(left,mid-1);
			quickSort(mid+1,right);
	
		}
	}
	long[] array={4,12,9,8,6,1,3,2,13};
	static long i=0;
	@Test
    public void test()
    {
    	long[] a={4,10,9,8,6,1,3,2,5};
//		long[] a={1,2,3,4,5,6,7,8,9};
//   	long[] c=bubbleSort(a);
//   	long[] c=selectSort(a);
//    	long[] c=insertSort(a);
//    	int c=find(6,a);
//    	System.out.println(c);
	
//    	doTower(10,"A","B","C");
//    	System.out.println(i);
//    	long[] c=insertSort(a);
//   	int c=partition(a,0,a.length,3);
    	quickSort(0,array.length-1);
    	for(long d:array)
    	{
    		System.out.println(d);
    	}
    	
    }

}
