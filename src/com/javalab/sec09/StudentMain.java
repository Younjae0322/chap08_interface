package com.javalab.sec09;

public class StudentMain {

	public static void main(String[] args) {
		Student std1 = new Student("1292001", "900424-1825409", "김광식", 3, "서울", 92);
		Student std2 = new Student("1292002", "900305-1730021", "김정현", 3, "서울", 20);
		Student std3 = new Student("1292003", "891021-2308302", "김현정", 4, "대전", 55);
		Student std4 = new Student("1292301", "890902-2704012", "김현정", 2, "대구", 78);
		Student std5 = new Student("1292303", "910715-1524390", "박광수", 3, "광주", 54);
		Student std6 = new Student("1292305", "921011-1809003", "김우주", 4, "부산", 88);
		Student std7 = new Student("1292501", "900825-1506390", "박철수", 3, "대전", 73);
		Student std8 = new Student("1292502", "911011-1809003", "백태성", 3, "서울", 95);
		
		System.out.println("[학생명단]");
		System.out.println("학번 \t   주민번호  \t 이름 \t학년 \t주소 \t학과");
		
		Student[] arr = {std1, std2, std3, std4, std5, std6, std7, std8};
		for(Student student : arr) {
			System.out.println(student.id + "\t" + student.jumin + "\t" + student.name + "\t" + student.year
					+ "\t" + student.address + "\t" + student.department);
		}
		

	}

}
