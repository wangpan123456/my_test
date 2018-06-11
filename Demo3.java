class  Demo3
{
	/**
	求偶数和
	*/
	public static void main(String[] args) 
	{
		int a =1;
		int b =100;
		int c= sum1(a,b);
		System.out.println("a"+"到"+"b"+"偶数和是"+c);
	}
	public static int sum1(int i, int j)
	{
		int s=0;
		for (int f=i; f < j ; f++ )
		{
			if (f%2==0)
			{ 
				s +=f;
			}
		}
		return s;
	}

}
