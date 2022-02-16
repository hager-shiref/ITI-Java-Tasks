abstract class GeoShape{
	protected float dim1;
	public GeoShape(float dim1){
		this.dim1=dim1;
	}
	
	public abstract float getArea();
}

class Circle extends GeoShape{
	protected float dim2;
	public Circle(float dim1,float dim2){
		super(dim1);
		this.dim2=dim2;
	}
	public void setDim2(float dim){
		this.dim1=dim;
	}
	public float getDim2(){
		return dim1;
	}
	@Override
	public float getArea(){
		float area=3.14f*dim2*dim2;
		return area;
	}
	
}
class Triangle extends GeoShape{
	protected float dim2;
	public Triangle(float dim1,float dim2){
		super(dim1);
		this.dim2=dim2;
	}
	public void setDim2(float dim){
		this.dim1=dim;
	}
	public float getDim2(){
		return dim1;
	}
	@Override
	public float getArea(){
		float area=0.5f*dim1*dim2;
		return area;
		
	}
}

class Rectangle extends GeoShape{
	protected float dim2;
	public Rectangle (float dim1,float dim2){
		super(dim1);
		this.dim2=dim2;
	}
	@Override
	public float getArea(){
		float area=dim1*dim2;
		return area;
	}
	
}
class Main{
	public static void main(String [] args){
		GeoShape g1=new Circle(30.0f,15.5f);
		GeoShape g2=new Triangle(40.0f,4.5f);
		GeoShape g3=new Rectangle(10.0f,8.5f);
		float total=calaArea(g1,g2,g3);
		System.out.println("Total Area : "+total);
		
	}
	public static float calaArea(GeoShape g1,GeoShape g2,GeoShape g3){
		float area1=g1.getArea();
		float area2=g2.getArea();
		float area3=g3.getArea();
		float totalArea=area1+area2+area3;
		return  totalArea;
		}
}