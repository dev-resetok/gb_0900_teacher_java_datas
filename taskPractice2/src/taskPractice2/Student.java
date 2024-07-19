package taskPractice2;

import java.util.Arrays;
import java.util.Objects;

public class Student {
	private String name;
	private int[] scores;
	
	public Student() {;}
	
	public Student(Student student) {
		this(student.name, student.scores);
	}

	public Student(String name, int[] scores) {
		super();
		this.name = name;
		this.scores = scores;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", scores=" + Arrays.toString(scores) + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return name.equals(other.name);
	}
}
