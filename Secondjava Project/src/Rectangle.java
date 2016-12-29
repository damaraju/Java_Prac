
public class Rectangle {

		float length;
		float width;
		float area;
		float perimeter;
//parameterised constructor 
		  
   public Rectangle(float length,float width){
	this.length = length;
	this.width = width;
	
}
//method
   public void calc2( float l,float w)
   {
 	  if( l>0&&w>0 )
 	  {
 		 
 		 this.area =(l*w); 
 		 this.perimeter = 2*(l+w);
 	  }
 	  else
 	  {
 		System.err.println("enter valid input");  
 	  }
 	  }
	

}
