class Parent{
	public void print(){
		System.out.println("Parent print");
	}
	public void print(int x){
		System.out.println("Parent print1");
	}
	public void show(){
		System.out.println("Parent show");
	}
}

class Child extends Parent{
	public void print(){
		System.out.println("Child print");
	}
	public void print(int x){
		System.out.println("Child print1");
	}
	@Override
	public void show(){
		System.out.println("Child show");
	}
}

class Main{
	public static void main(String []args){
		Parent p1=new Parent();
		p1.show();
		p1.print();
		Child c1=new Child();
		c1.show();
		c1.print(2);
	}
}
