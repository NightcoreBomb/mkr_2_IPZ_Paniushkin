public class Game {
    public static void main(String[] args) {
        Arena arena = new Arena();

        // Додаємо спостерігача
        ArenaObserver observer = new ArenaObserver();
        arena.addObserver(observer);

        // Створюємо персонажів за допомогою фабричного методу
        Character warrior = CharacterFactory.createCharacter("warrior", "Овердез", 0, 0);
        Character mage = CharacterFactory.createCharacter("mage", "Рудеус", 1, 1);
        Character archer = CharacterFactory.createCharacter("archer", "Робін-Гуд", 2, 2);

        // Додаємо персонажів на арену
        arena.addCharacter(warrior);
        arena.addCharacter(mage);
        arena.addCharacter(archer);

        // Координація атак через медіатор (арену)
        System.out.println("\nКоординація атак:");
        arena.coordinateAttack(warrior, mage);
        arena.coordinateAttack(archer, warrior);
    }
}