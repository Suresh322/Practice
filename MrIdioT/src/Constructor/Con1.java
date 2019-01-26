package Constructor;

public class Con1 
{
  int id;
  String name;
  void display()
  {
	  System.out.println(id+" "+name);
  }
  
  
  public static void main(String [] args)
  {
	  Con1 s1=new Con1 ();
	  s1.display();
  }
}
