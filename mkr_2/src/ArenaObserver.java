class ArenaObserver implements Observer {
    @Override
    public void update(Character character, String message) {
        System.out.println("[Сповіщення] " + character.getName() + ": " + message);
    }
}