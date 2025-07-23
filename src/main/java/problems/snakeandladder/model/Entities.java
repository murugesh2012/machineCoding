package problems.snakeandladder.model;

import java.util.HashMap;

public class Entities {
    static HashMap<Integer, Integer> snakes;
    static HashMap<Integer, Integer> ladders;
    static HashMap<Integer, String> players;
    static Entities instance = null;

    public Entities() {
        snakes = new HashMap<>();
        ladders = new HashMap<>();
        players = new HashMap<>();
    }

    public void setSnake(int startPosition, int endPosition) {
        if(startPosition == 100 || snakes.containsKey(startPosition))
        {
            System.out.println("Error: Cannot place a snake to end position 100 or Multiple Snakes cant start same position. Terminating program.");
            System.exit(1);
        }

        snakes.put(startPosition, endPosition);
    }

    public HashMap<Integer, Integer> getSnakes() {
        return snakes;
    }

    public void setLadder(int startPosition, int endPosition) {
        if(ladders.containsKey(startPosition) || snakes.containsKey(startPosition))
        {
            System.out.println("Error: Multiple Ladder head cant be at same position. Terminating program.");
            System.exit(1);
        }
        ladders.put(startPosition, endPosition);
    }

    public HashMap<Integer, Integer> getLadders() {
        return ladders;
    }

    public void setPlayer(int index, String playerName) {
        players.put(index, playerName);
    }

    public HashMap<Integer, String> getPlayers() {
        return players;
    }

    public static Entities getInstance() {
        if (instance == null) {
            instance = new Entities();
        }
        return instance;
    }
}
