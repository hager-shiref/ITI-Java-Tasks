class Main{
	public static void main (String [] args){
		Complex c1 =new Complex(5,2);
		Complex c2 = new Complex(10,-5);
		Complex c3 = new Complex(10,-5);
		Complex add =Complex.sum (c1,c2);
		Complex sub=Complex.subtract(c1,c2);
		c3.print();
	}
}