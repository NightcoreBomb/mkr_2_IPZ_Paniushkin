class Archer extends Character {
    public Archer(String name, int x, int y) {
        super(name, 120, 30, x, y);
    }

    @Override
    public void attack(Character target) {
        System.out.println(name + " стріляє в " + target.getName() + " з силою " + attackPower);
        System.out.println("------------------------------------------------------------------------------------");
    }
}