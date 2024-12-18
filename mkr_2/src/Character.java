abstract class Character {
    protected String name;
    protected int health;
    protected int attackPower;
    protected int x, y; // координати персонажа

    public Character(String name, int health, int attackPower, int x, int y) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public abstract void attack(Character target);

    public boolean isInVisibilityRange(Character other) {
        int distance = Math.abs(this.x - other.x) + Math.abs(this.y - other.y);
        return distance <= 3; // Наприклад, радіус видимості дорівнює 3
    }
}