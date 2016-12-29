
public class Circle {
 double radius;
 double diameter;
 double pi  = 3.14;
 double area;
 double circumfarence;

  public Circle( double rad,double pi){
	  this.radius = rad;
	  this.pi = pi;
	  
	  //this.area = pi*rad*rad;
	  //this.circumfarence = 2*pi*rad;
	  
  }
 //method1 using radius
  public void calc( double  r1)
  {
	  if( r1<=this.radius )
	  {
		 //this.radius = this.radius-r1;
		 this.area = this.pi*(this.radius-r1)*(this.radius-r1); 
		 this.circumfarence = 2*this.pi*(this.radius-r1);
	  }
	  else
	  {
		System.err.println("enter valid input");  
	  }
	  }
 //method2 using diameter 
  public void calc( double d, double pi)
  {
	  if(d>=this.radius )
	  {
		 
		 this.area = this.pi*(d/2)*(d/2); 
		 this.circumfarence = 2*this.pi*(d/2);
	  }
	  else
	  {
		System.err.println("enter valid input");  
	  }
	  }
  }

