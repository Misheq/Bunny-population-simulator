package bussiness_code;

import java.util.Random;

public class Bunny {

	private String name;
	private FurColor color;
	private Gender sex;
	private int age;
	private boolean isVampire;
	private static final String MALE_NAMES[] = { "Abel", "Nyusz", "Kevin", "Frodo", "Batman", "Pistike", "Jancsika", "Kiskiraly", "Zambo" };
	private static final String FEMALE_NAMES[] = { "Puffi", "Cunci", "Anna", "Gyulcsika", "Bozsike", "Alexa", "Tincsike", "Maris", "Duduka" };

	public Bunny(String name) {
		setColor();
		setAge();
		setSex();
		setName();

	}

	public String getName() {
		return name;
	}

	private void setName() {
		Random rnd = new Random();
		int index;
		switch (getSex()) {
		case Male:
			index = rnd.nextInt(MALE_NAMES.length);
			this.name = MALE_NAMES[index];
			break;
		case Female:
			index = rnd.nextInt(FEMALE_NAMES.length);
			this.name = FEMALE_NAMES[index];
			break;
		default:
			break;
		}
	}

	public FurColor getColor() {
		return color;
	}

	private void setColor() {
		FurColor colors[] = { FurColor.brown, FurColor.black, FurColor.white, FurColor.spotted };
		Random rnd = new Random();
		int random = rnd.nextInt(colors.length);

		this.color = colors[random];
	}

	public Gender getSex() {
		return sex;
	}

	private void setSex() {
		Random rnd = new Random();
		int random = rnd.nextInt();

		if (random == 0) {
			this.sex = Gender.Male;
		} else {
			this.sex = Gender.Female;
		}
	}

	public int getAge() {
		return age;
	}

	private void setAge() {
		Random rnd = new Random();
		int random = rnd.nextInt(11);

		this.age = random;
	}

	public boolean isVampire() {
		return isVampire;
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

}
