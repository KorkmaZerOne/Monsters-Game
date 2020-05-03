package tecteun;

public class Bear extends MightMonster {

	private int holeNr;

	public Bear() {

	}

	public Bear(int hp) {
		super(0, hp);
	}

	public Bear(int hp, int rp) {
		super(rp, hp);
	}

	public Bear(int holeNr, int hp, int rp) {
		super(rp, hp);
		this.holeNr = holeNr;
	}

	public int bearClawAttack() {
		if (this.useRP(8)) {
			System.out.println("rooaar!!");
			return 10;
		} else {
			System.out.println("out of rage points"); // geen ragePoints points
			return 0;
		}
	}

}
