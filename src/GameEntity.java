public class GameEntity {
    private String name;
    private int health;
    private int power;

    public GameEntity(int health, int power, String name) {
        this.health = health;
        this.power = power;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
