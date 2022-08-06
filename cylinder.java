//This program is Created by Aryaan Rabara 21CE112
class cylinder {
	
		double height;
		double radius;
        //Create default constructor
		cylinder()
				{
					height = 1;
					radius = 1;
				}
                //create parameterized constructor
		cylinder(double h,double r)
		{
			height=h;
			radius=r;
		}
        //create method named getarea
		public double getarea()
		{
			
			double area;
			area = (2*3.14*radius*height) + (3.14*radius*radius);
			return area;
		}
				
	}

