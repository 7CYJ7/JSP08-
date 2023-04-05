package test;

public class MainClass {

	public static void main(String[] args) {
		Student student1 = new Student(); // 초기화가 안된채로 객체생성
		
		Student student2 = new Student("홍길동", 20, 3); // 초기값 부여하고 객체생성
		
		student1.setName("이순신"); // set으로 초기화 시킨다.
		student1.setAge(24);
		student1.setGrade(4);
		
		System.out.println(student1.getName()); // get으로 불러온다.
		System.out.println(student2.getName());
		

	}

}
