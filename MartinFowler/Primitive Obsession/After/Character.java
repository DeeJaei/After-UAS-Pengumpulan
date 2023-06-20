
public class Character {
	private String name;
	private String charClass;
	private String weapon;
	private String weaponType;
	private String armor;
	private String armorType;
	
	public Character(String name, String charClass, String weapon, String weaponType, String armor, String armorType) {
		super();
		this.name = name;
		this.charClass = charClass;
		this.weapon = new weapon(weapon, weaponType);
		this.armor = new armor(armor,armorType);
		this.armorType = armorType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCharClass() {
		return charClass;
	}

	public void setCharClass(String charClass) {
		this.charClass = charClass;
	}
}
