package bussiness_code;

import java.util.Random;

public class Bunny {

	private String name;
	private FurColor color;
	private boolean isMale;
	private int age;
	private boolean isVampire;
	private boolean isMature;

	private static final String MALE_NAMES[] = { "Abel", "Nyusz", "Kevin", "Frodo", "Batman", "Pistike", "Jancsika", "Kiskiraly", "Zambo" };
	private static final String FEMALE_NAMES[] = { "Puffi", "Cunci", "Anna", "Gyulcsika", "Bozsike", "Alexa", "Tincsike", "Maris", "Duduka" };

	public Bunny(String init) {
		if (init.equals("init")) {
			setColor();
			setVampire();
			setAge();
			setSex();
			setName();
		} else {
			System.out.println("FAILURE, write init");
		}
	}

	public Bunny() {
		this.age = 0;
		setVampire();
		setColor();
		setSex();
		setName();
	}

	public String getName() {
		return this.name;
	}

	private void setName() {
		Random rnd = new Random();
		int index;

		if (this.isMale) {
			index = rnd.nextInt(MALE_NAMES.length);
			this.name = MALE_NAMES[index];
		} else {
			index = rnd.nextInt(FEMALE_NAMES.length);
			this.name = FEMALE_NAMES[index];
		}
	}

	public FurColor getColor() {
		return this.color;
	}

	private void setColor() {
		FurColor colors[] = { FurColor.brown, FurColor.black, FurColor.white, FurColor.spotted };
		Random rnd = new Random();
		int random = rnd.nextInt(colors.length);

		this.color = colors[random];
	}

	public boolean isMale() {
		return this.isMale;
	}

	private void setSex() {
		Random rnd = new Random();
		int random = rnd.nextInt(2);

		if (random == 0) {
			this.isMale = true;
		} else {
			this.isMale = false;
		}
	}

	public int getAge() {
		return this.age;
	}

	private void setAge() {
		Random rnd = new Random();
		int random = rnd.nextInt(11);

		this.age = random;
		setMature(this.age);
	}

	public boolean isVampire() {
		return this.isVampire;
	}

	public void setVampire() {
		Random rnd = new Random();
		int random = rnd.nextInt(100) + 1;

		if (random <= 2) {
			this.isVampire = true;
		} else {
			this.isVampire = false;
		}
	}

	public boolean isMature() {
		return this.isMature;
	}

	public void setMature(int age) {
		this.isMature = age >= 2 && !this.isVampire;
	}

	public void addAge() {
		this.age++;
		setMature(this.age);
	}

	@Override
	public String toString() {
		return getName() + " " + (this.isMale ? "Male" : "Female") + " " + getColor() + " " + getAge() + (this.isVampire ? " Vamp" : "") + (this.isMature ? " Mature" : " Juvenile");
	}

}
