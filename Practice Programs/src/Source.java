import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Source {
	public static void main(String[] args) {
		List<Student> s=new ArrayList<Student>();
		s.add(new Student("Ayaan", 12, 99));
		s.add(new Student("Jaenny", 14, 29));
		s.add(new Student("Shaeryl", 17, 89));
		s.add(new Student("Sarah", 19, 55));
		
		StudentImplementation si=new StudentImplementation();
		System.out.println(si.sort(s));
		
		System.out.println(si.getScoreAbove35(s));
	}

}

class Student{
	String name;
	Integer roll;
	Integer score;
	public Student(String name, Integer roll, Integer score) {
		super();
		this.name = name;
		this.roll = roll;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRoll() {
		return roll;
	}
	public void setRoll(Integer roll) {
		this.roll = roll;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", score=" + score + "]";
	}
	
	
	
}

class StudentImplementation {
	public List<Student> sort(List<Student> student) {
		List<Student> s = new ArrayList<>();
		s =  student.stream().sorted(Comparator.comparing(con -> con.getScore())).collect(Collectors.toList());
		return s;
	}
	
	public Long getScoreAbove35(List<Student> student) {
		List<Student> c = new ArrayList<>();
		c = student.stream().filter(con -> con.getScore()>35).toList();		
		return (long) c.size();
	}
}
