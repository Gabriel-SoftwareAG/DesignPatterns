package memento;

class Client {
    public static void main(String[] args) {
        Player player = new Player();
        SaveManager saveManager = new SaveManager();

        // Player progresses in the game
        player.setState("Level 1");
        saveManager.add(player.saveStateToMemento());
        System.out.println("Player saved state state: " + player.getState());

        // Player reaches a checkpoint
        player.setState("Level 2");
        saveManager.add(player.saveStateToMemento());
        System.out.println("Player saved state state: " + player.getState());


        // Player wants to revert to the previous state
        player.getStateFromMemento(saveManager.get(0));
        System.out.println("Player reverted to state: " + player.getState());
    }
}
