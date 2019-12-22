package packagecheckformodifiers1;

class A {
	
	
	final protected static int i=10;
    int j=11;
    protected int m=7;
	public int k=10;
	public static void main(String[] args) {

		
		System.out.println(i*100);
	}
	
	void main()
	{
		System.out.println("this is default main() method in default class A");
	}

	protected void main(int i)
	{
		System.out.println("this is protected main(i) method in default class A");
	}
	
	public void main(int k,int j)
	{
		System.out.println("this is protected main(i,k) method in default class A");
	}
}
