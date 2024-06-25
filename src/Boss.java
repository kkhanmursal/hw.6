public class Boss extends GameEntity {
    public Weapon weapon;

    public Boss(int health, int power, String name, WeaponType weapon) {
        super(health, power, name);
    }


    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void PrintInfo() {
        System.out.println("Boss name: " + getName());
        System.out.println("Boss Health: " + getHealth());
        System.out.println("Boss Attack Power: " + getPower());
        System.out.println("Boss Weapon Type: " + Weapon.getWeaponType());
        System.out.println("Boss Weapon Name: " + Weapon.getWeaponName());
    }
}
