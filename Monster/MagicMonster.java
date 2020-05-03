package tecteun;

public abstract class MagicMonster extends Monster {
	private int magicPoints;
	private int maxMP;

	public MagicMonster() {

	}

	public MagicMonster(int maxMP, int maxHP) {
		super(maxHP);
		this.maxMP = maxMP;
		this.magicPoints = maxMP;
	}

	public int getMagicPoints() {
		return magicPoints;
	}

	public void setMagicPoints(int magicPoints) {
		this.magicPoints = magicPoints;
	}

	public void restoreMP(int mana) {
		this.magicPoints += mana;
		if (this.magicPoints > this.maxMP) {
			this.magicPoints = this.maxMP;
		}
	}

	public boolean useMP(int mana) {
		this.magicPoints -= mana;
		if (this.magicPoints >= 0) {
			return true;
		} else {
			this.magicPoints += mana;
			return false;
		}
	}

}
