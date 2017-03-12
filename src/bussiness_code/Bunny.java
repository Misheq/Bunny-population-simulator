package bussiness_code;

public class Bunny {

	private String name;
	private String color;
	private char sex;
	private int age;
	private boolean isVampire;

	public Bunny(String name, String color, char sex, int age, boolean isVampire) {
		this.name = name;
		this.color = color;
		this.sex = sex;
		this.age = age;
		this.isVampire = isVampire;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public char getSex() {
		return sex;
	}

	public int getAge() {
		return age;
	}

	public boolean isVampire() {
		return isVampire;
	}

	public void setVampire(boolean isVampire) {
		this.isVampire = isVampire;
	}

}
