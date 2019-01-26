package Constructor;
public class Con3

{
	  int id;
	  String name;
	  int age;
	  Con3(int i,String s)
	  {
		id=i;
		name=s;
	  }
	  Con3(int i,String s,int a)
	  {
		id=i;
		name=s;
		age=a;
	  }
	  void display()
	  {
		  System.out.println(id+" "+name+" "+age);
	  }
	  
	  
	  public static void main(String [] args)
	  {
		  Con3 s1=new Con3(322,"M.Suresh");
		  Con3 s2=new Con3(322,"Suresh",23);
		  s1.display();
		  s2.display();
	  }
	}

