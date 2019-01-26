package Constructor;

public class Con4 {
	  int length;
	  int width;
	  int height;
	  Con4 (int l,int w,int h)
	  {
		  length=l;
		  width=w;
		  height=h;
	  }
	    int volume()
	  {
		return(length*width*height);
	  }
	 public static void main(String [] args)
	 {
		 Con5 c=new Con5(10,30,50);
		 Con5 d=new Con5(20,40,60);
		 c.volume();
		 d.volume();
	 }

}
