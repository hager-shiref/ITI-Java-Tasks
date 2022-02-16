class Main{
	public static void main(String [] args){
		Student student1=new Student("Hager",21,"Android");
		student1.setName("ro");
		student1.setAge(20);
		student1.setTrack("UI");
		String s1=student1.getName();
		System.out.println(s1);
		student1.print();
	}
}