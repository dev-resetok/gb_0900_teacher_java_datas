package taskPractice2;

public class Page {
	public static void main(String[] args) {
		School school = new School();
		
		Student student1 = new Student("김범수", new int[] {30, 40, 60});
		Student student2 = new Student("임창정", new int[] {40, 40, 90});
		Student student3 = new Student("장윤정", new int[] {10, 10, 0});
		Student student4 = new Student("김나영", new int[] {70, 80, 90});
		Student student5 = new Student("박정현", new int[] {20, 50, 30});
		Student student6 = new Student("박효신", new int[] {100, 70, 80});
		Student student7 = new Student("이승철", new int[] {0, 0, 0});
		
		school.addStudent(student1);
		school.addStudent(student2);
		school.addStudent(student3);
		school.addStudent(student4);
		school.addStudent(student5);
		school.addStudent(student6);
		
		school.addStudent(student7);
		System.out.println(school.showAll());
		school.findStudent("장윤정");
		school.removeStudent("박정현");
		school.updateStudent(new Student("김범수", new int[] {50, 50, 60}));
		System.out.println(school.showAll());
		
	}
}
