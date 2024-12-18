class Mage extends Character {
    public Mage(String name, int x, int y) {
        super(name, 100, 40, x, y);
    }

    @Override
    public void attack(Character target) {
        System.out.println(name + " кастує заклинання на " + target.getName() + " з силою " + attackPower);
    }
}