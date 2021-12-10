package mix;

public class NonPrimitiveDataTypeByReferece {

	public static void main(String[] args) {
		Home h1 = new Home();
		System.out.println(h1.area);    //h1.area ------> 100
		
		newArea(h1);                     // we sent the object itself to the method
		System.out.println(h1.area);    // h1.area------> 150  
		
		

	}
	// object sent by reference to the method as a parameter
	public static void newArea(Home x) {    // here we sent the object itself to the 
		System.out.println(x.area += 50 );  // method and that why any change at the 
	}                                        // object's attributes will change the 
                                              // the original valuse
}
class Home{
	int area = 100 ;
}
