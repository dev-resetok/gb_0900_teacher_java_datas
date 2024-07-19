package taskPractice2;

import java.util.ArrayList;

public class School {
	
//		학생 성적 추가
		public void addStudent(Student student) {
			DBConnecter.students.add(student);
		}
		
//		학생 이름으로 조회
		public Student findStudent(String name) {
			Student student = null;
			
			for (int i = 0; i < DBConnecter.students.size(); i++) {
				if(DBConnecter.students.get(i).getName() == name) {
					student = new Student(DBConnecter.students.get(i));
				}
			}
			
			return student;
		}
		
//		학생 성적 삭제
		public void removeStudent(String name) {
			if(findStudent(name) != null) {
				DBConnecter.students.remove(findStudent(name));
			}
		}
		
//		학생 점수 수정
		public Student updateStudent(Student student) {
			Student student2 = null;
			int index = 0;
			
			index = DBConnecter.students.indexOf(findStudent(student.getName()));
			DBConnecter.students.set(index, student);
			student2 = new Student(DBConnecter.students.get(index));
			
			return student2;
		}
		
//		전체 학생 조회
		public ArrayList<Student> showAll() {
			
			return (ArrayList<Student>) DBConnecter.students.clone();
		}
}
