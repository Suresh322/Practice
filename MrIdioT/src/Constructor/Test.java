package Constructor;
 class B
{ 
	B ()
	{
		System.out.println("B CONSTRUCTOR IS CALLED");
	}

}
class C extends B
{
	C ()
	{
		System.out.println("C CONSTRUCTOR IS CALLED");
	}
	 	
}
class D extends C 
{
    D ()
	{
		System.out.println("D CONSTRUCTOR IS CALLED");
	}
}

 
class Test
{
	public static void main(String [] args)
	{  
		D d1=new D();
	
	}
}
	




