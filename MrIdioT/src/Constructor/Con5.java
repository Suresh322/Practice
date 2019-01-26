package Constructor;

public class Con5 
{
  int length;
  int width;
  int height;
  Con5 (int l,int w,int h)
  {
	  length=l;
	  width=w;
	  height=h;
  }
   void volume()
  {
	System.out.println(length*width*height);
  }
 public static void main(String [] args)
 {
	 Con5 c=new Con5(10,30,50);
	 Con5 d=new Con5(20,40,60);
	 c.volume();
	 d.volume();
 }
}
