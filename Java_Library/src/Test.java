import java.util.Arrays;
import java.util.LinkedList;


public class Test {
	public static void merge(int[] a,int[] b,int[] c)
	{
		int i=0,j=0,k=0;
		while(i<a.length && j<b.length)
		{
			if(a[i]<b[j])c[k++]=a[i++];
			else c[k++]=b[j++];
		}
		while(i<a.length)c[k++]=a[i++];
		while(j<b.length)c[k++]=b[j++];
	}
	public static void sort(int[] a)
	{
		if(a.length==1)return;
		int[] left=new int[a.length/2];
		int[] right=new int[a.length-left.length];
		for(int i=0;i<left.length;i++)left[i]=a[i];
		for(int j=0;j<right.length;j++)right[j]=a[left.length+j];
		sort(left);
		sort(right);
		merge(left, right,a);
	}
	public static void quick(int[] a,int st,int end)
	{
		if(st>end)return;
		int i=st,j=end;
		int pivot=(i+j)/2;
		if(i<j)
		{
			while(a[i]<a[pivot])i++;
			while(a[j]>a[pivot])j--;
		}
		if(i<=j)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++; 
			j--;
		}
		quick(a, st, j);
		quick(a,i,end);
	}
	public static void insertion(int [] a)
	{
		for(int i=1;i<a.length;i++)
		{
			int key=a[i];
			int j=i-1;
			while(j>=0 && a[j]>key)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
	}
	public static void selection(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			int index=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[index])index=j;
			}
			if(i!=index)
			{
				int temp=a[i];
				a[i]=a[index];
				a[index]=temp;
			}
		}
	}
	public static void bubble(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	public static String swap(String s,int i,int j)
	{
		char[] ch=s.toCharArray();
		char temp=ch[i];
		ch[i]=ch[j];
		ch[j]=temp;
		return new String(ch);
	}
	public static void StringPerm(String s,int st,int end)
	{
		if(st==end)
		{
			System.out.println(s);
			return;
		}
		for(int i=st;i<=end;i++)
		{
			String s1=swap(s,st,i);
			StringPerm(s1, st+1, end);
		}
	}
	public static void main(String[] args) {
		int[][] a= {{1,2,1},
			    {1,1,1},
			    {3,3,1}};
	int[][] b= {{2,2,1},
			    {3,3,1},
			    {1,1,2}};
	String s="abc";
	StringPerm(s, 0, s.length()-1);
	}
}
