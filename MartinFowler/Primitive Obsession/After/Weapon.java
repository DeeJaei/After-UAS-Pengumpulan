public class Weapon {
    private String weapon;
	private String weaponType;
    public weapon(String weapon, String weaponType){
		super();
		this.weapon = weapon;
		this.weaponType = weaponType;

        public String getWeapon() {
            return weapon;
        }
    
        public void setWeapon(String weapon) {
            this.weapon = weapon;
        }
    
        public String getWeaponType() {
            return weaponType;
        }
    
        public void setWeaponType(String weaponType) {
            this.weaponType = weaponType;
        }
	}
}
