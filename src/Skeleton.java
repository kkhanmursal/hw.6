public class Skeleton extends Boss {
    private int arrowCount;

    public Skeleton(int health, int attackPower, String name, WeaponType weapon) {
        super(health, attackPower, name, weapon);

    }

    public int getArrowCount() {
        return arrowCount;
    }

    public void setArrowCount(int arrowCount) {
        this.arrowCount = arrowCount;
        setArrowCount(100);

    }
    @Override
    public void PrintInfo(){
        super.PrintInfo();
        System.out.println("skeleton arrow count: " + arrowCount);
    }
}
