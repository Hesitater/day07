package overriding.person;

public class Teacher extends Person {

	String subject;

	String info() {
		return "이름:" + name + ", 나이:" + age + ", 강의과목:" + subject;
	}
}
