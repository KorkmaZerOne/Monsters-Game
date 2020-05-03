package tecteun;

public class Witch extends MagicMonster {
	private String name;

	public Witch() {

	}

	public Witch(int hp) {
		super(0, hp);
	}

	public Witch(int hp, int mp) {
		super(mp, hp);
	}

	public Witch(String name, int hp, int mp) {
		super(mp, hp);
		this.name = name;
	}

	public int fireballAttack() {
		if (this.useMP(5)) {
			System.out.println("fwooosh!!");
			return 8;
		} else {
			System.out.println("out of magic points!");
			return 0;
		}
	}

}
