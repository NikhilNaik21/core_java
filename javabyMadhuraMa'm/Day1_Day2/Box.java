package D2;

class Box {
	//
	//instance variable
	private double width,height,depth;
	
	//parameterized constructor
	
	Box(double side){
		this(side,side,side);
	}
	Box(double w,double h,double d)
	{
		
		//this : current object reference
		this.width=w;
		this.height=h;
		this.depth=d;  
		
	}
	//add overloaded parameterized constructor to init a cube
	

	//methods
	//1. To return Box details in string form(dimensions of Box)
	
	String getBoxDims()
	{
		//implicitly added this.
		return "Box dims: " + " "+this.width +" " +height +" " + depth ;
	}
	
	double computeVolume()
	{
		return width*depth*height;
	}
	
	//method to check equality
	public boolean isEqual(Box b2) {
		// TODO Auto-generated method stub
		return this.width==b2.width && this.depth==b2.depth && this.depth==b2.depth;
	}


}
