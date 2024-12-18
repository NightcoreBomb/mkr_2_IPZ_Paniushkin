class CharacterFactory {
    public static Character createCharacter(String type, String name, int x, int y) {
        Character character;
        switch (type.toLowerCase()) {
            case "warrior":
                character = new Warrior(name, x, y);
                break;
            case "mage":
                character = new Mage(name, x, y);
                break;
            case "archer":
                character = new Archer(name, x, y);
                break;
            default:
                throw new IllegalArgumentException("Unknown character type: " + type);
        }
        printCharacterStats(character);
        return character;
    }

    private static void printCharacterStats(Character character) {
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Персонаж: " + character.getName());
        System.out.println("  Здоров'я: " + character.health);
        System.out.println("  Сила атаки: " + character.attackPower);
        System.out.println("  Координати: (" + character.x + ", " + character.y + ")");
        System.out.println("------------------------------------------------------------------------------------");
    }
}