package algorithm;

public class Test3 {

	static class Person{
		int no = 10;
		String name;
		
		Person(int no){
			this.no = no;
			System.out.println("person int no 호출");
		}
		Person(int no, String name) {
			this(no);
			this.name = name;
			System.out.println("person int no , name 호출");
		}
	}
	
	public static void main(String[] args) {
		Person one = new Person(100,"김철수");
		System.out.println(one.no);
		
	}

}
