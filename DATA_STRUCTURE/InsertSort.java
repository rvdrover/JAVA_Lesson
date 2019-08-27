class InsertSort
{
	public static void main(String[] args)
	{
	int a[]={4,3,2,1,6};
		for (int i=1;i<a.length;i++)
		{
			int current=a[];
			int hole=i;
			while(a[hole-1]>current)
			{
				a[hole]=a[hole-1];
				hole=hole-1;
			}
			a[hole]=current;
		}
	}
}