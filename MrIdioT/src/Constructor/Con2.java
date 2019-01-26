package Constructor;

public class Con2 
{
  int id;
  String name;
  Con2(int i,String s)
  {
	id=i;
	name=s;
  }
  void display()
  {
	  System.out.println(id+" "+name);
  }
  
  
  public static void main(String [] args)
  {
	  Con2 s1=new Con2(322,"M.Suresh");
	  Con2 s3=new Con2(522,"A.Mustaq");
	  s1.display();
	  s3.display();
  }
}

