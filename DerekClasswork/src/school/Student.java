package school;

public class Student extends Person {
	private String [][] Classes;
	private String school;
	private double OSIS;
	private int gradelevel;
	private double GPA;
	public Student (String firstName, String familyName, int age, double GPA)
	{
		super(firstName, familyName, age, "Student");
		this.GPA = GPA;
	}
	public String greeting()
	{
		String response = "Hi my name is " + getFirstName() + " " + getFamilyName();
		return response + ".\n" + (greetings[(int)Math.random() * greetings.length)]);
	}
}
