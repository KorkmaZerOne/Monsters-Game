package tecteun;

public abstract class Monster {

	private int hitPoints;
	private int maxHP;

	public Monster() {
		
	}
	
	public Monster(int maxHP) {
		this.maxHP = maxHP;
		this.hitPoints = maxHP;
	}

	public int getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	public int getMaxHP() {
		return maxHP;
	}

	public void setMaxHP(int maxHP) {
		this.maxHP = maxHP;
	}

	public void heal(int heal) {
		this.hitPoints += heal;
		if (this.hitPoints > this.maxHP) {
			this.hitPoints = this.maxHP;
		}
	}

	public boolean takeDamage(int dmg) {
		this.hitPoints -= dmg;
		if (this.hitPoints > 0) {
			return true;
		} else
			this.hitPoints =0;
			return false;
	}

}
