public class Student{
	private String name;
	private int age;
	private String track;
	public Student (String name,int age,String track){
		this.name=name;
		this.age=age;
		this.track=track;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}
	public void setTrack(String track){
		this.track=track;
	}
	public String getTrack(){
		return track;
	}
	public void print(){
		System.out.println("Student name :"+name);
		System.out.println("Student age :"+age);
		System.out.println("Student Track :"+track);


	}
}