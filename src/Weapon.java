public class Weapon {
    private static String weaponType;
    private static String weaponName;

    public Weapon(WeaponType type, String name) {
        this.weaponType = weaponType;
        this.weaponName = weaponName;
    }
    public static String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    public static String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }
}
