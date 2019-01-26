package Constructor;

public class A 
{
	int a=15;
    void m1(Object o) 
	{ 
		a=20;
		System.out.println(a);
	}


public static void main(String [] args)
{ 
   A b=new A();
     b.m1("A");


}
}