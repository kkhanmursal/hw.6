public class Main {
    public static void main(String[] args) {
        Weapon bossWeapon = new Weapon(WeaponType.Knife, "Dragon Slayer");

        Boss boss = new Boss(100, 100, "Thanos", WeaponType.Sword);

        Weapon skeletonWeapon = new Weapon(WeaponType.Gun, "Bone Shooter");
        Skeleton skeleton1 = new Skeleton(50, 50, "Heilo", WeaponType.Knife);
        Skeleton skeleton2 = new Skeleton(60, 70, "Spike", WeaponType.Gun);

        System.out.println("Boss Information:");
        boss.PrintInfo();
        System.out.println();

        System.out.println("Skeleton 1 Information:");
        skeleton1.PrintInfo();
        System.out.println();

        System.out.println("Skeleton 2 Information:");
        skeleton2.PrintInfo();
    }
}