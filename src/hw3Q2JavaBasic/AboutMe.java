package hw3Q2JavaBasic;

public class AboutMe {

	public String name = "Nahid Sanwar";
	public byte age = 41;
	public short yearlyRent = 31500;
	public int yearlySalary = 250000;
	public long bankBalance = 2150000000l;
	public float height = 5.07f;
	public double bmi = 4.678376676783;
	public char sex = 'M';
	public boolean usCitizen = true;

	public static void main(String[] args) {

		byte age;

		AboutMe aboutMe = new AboutMe();

		System.out.println("Name: " + aboutMe.name);
		System.out.println("Age: " + aboutMe.age);
		System.out.println("Yearly Rent:USD" + aboutMe.yearlyRent);
		System.out.println("Yearly Salary:USD" + aboutMe.yearlySalary);
		System.out.println("Bank Balance:USD" + aboutMe.bankBalance);
		System.out.println("Height:" + aboutMe.height);
		System.out.println("BMI:" + aboutMe.bmi);
		System.out.println("Sex:" + aboutMe.sex);
		System.out.println("USA Citizenship:" + aboutMe.usCitizen);

	}

}
