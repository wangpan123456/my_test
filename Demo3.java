class  Demo3
{
	/**
	��ż����
	*/
	public static void main(String[] args) 
	{
		int a =1;
		int b =100;
		int c= sum1(a,b);
		System.out.println("a"+"��"+"b"+"ż������"+c);
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
