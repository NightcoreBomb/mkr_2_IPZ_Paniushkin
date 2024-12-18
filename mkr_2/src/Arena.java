import java.util.ArrayList;
import java.util.List;

class Arena {
    private List<Character> characters = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    public void addCharacter(Character character) {
        characters.add(character);
        notifyObservers(character, "доданий на арену.");
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    private void notifyObservers(Character character, String message) {
        for (Observer observer : observers) {
            observer.update(character, message);
        }
    }

    public void coordinateAttack(Character attacker, Character target) {
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Арена координує атаку: " + attacker.getName() + " атакує " + target.getName());
        attacker.attack(target);
        checkVisibility(attacker);
        checkVisibility(target);
    }

    private void checkVisibility(Character source) {
        for (Character target : characters) {
            if (!source.equals(target) && source.isInVisibilityRange(target)) {
                notifyObservers(source, "бачить персонажа " + target.getName());
            }
        }
    }
}