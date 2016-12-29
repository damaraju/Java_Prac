
public class Circle_Test {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
     //  Circle round = new Circle();
     //  round.radius = 3;
      // round.area = round.pi* round.radius*round.radius;
    //   round.circumfarence = 2*round.pi*round.radius;
    //   System.out.println("RADIUS:" + round.radius);
    //   System.out.println("AREA:" + round.area);
    //   System.out.println("CIRCUMFARENCE:" + round.circumfarence);

		Circle round = new Circle(6,3.14);
	
		
		 // Method 1
		       round.calc(4);
		       //System.out.println("Method output");
		       System.out.println("AREA:" + round.area);
				 System.out.println("CIRCUMFARENCE:" + round.circumfarence);
				 
				 // Method 2
			       round.calc(10,3.14);
			       //System.out.println("Method output");
			       System.out.println("AREA:" + round.area);
					 System.out.println("CIRCUMFARENCE:" + round.circumfarence);
	
					//Rectangle_Test
						
					//	Rectangle rect = new Rectangle(3,4);
						
						//Method
						
					//	 rect.calc2(1,2);
					//	 System.out.println("AREA:" + rect.area);
					//	 System.out.println("PERIMETER:" + rect.perimeter);
	}
}
	
