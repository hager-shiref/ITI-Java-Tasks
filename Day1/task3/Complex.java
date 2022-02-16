public class Complex{
	private int real;
	private int img;
	public Complex(int real,int img){
		this.real=real;
		this.img=img;
	}
	public void print(){
		if(img >=0)
			System.out.println("Complex Number : "+ real + "+" +img+"i");
		else
			System.out.println("Complex Number : " + real  + img+"i");
	}
	//static because every complex number is unique
	public  static Complex sum (Complex c1,Complex c2){
		Complex number=new Complex(0,0);
		number.real=c1.real+c2.real;
		number.img=c1.img+c2.img;
		if(number.img>=0)
			System.out.println("Sum is "+number.real+ "+" +number.img +"i");
		else 
			System.out.println("Sum is "+number.real + number.img +"i");
		return number;
	}
	public  static Complex subtract (Complex c1,Complex c2){
		Complex number=new Complex(0,0);
		number.real=c1.real-c2.real;
		number.img=c1.img-c2.img;
		if(number.img>=0)
			System.out.println("Subtract is "+number.real+ "+" +number.img +"i");
		else 
			System.out.println("Subtract is "+number.real + number.img +"i");
		return number;
	}
	
	
}