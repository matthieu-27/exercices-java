import java.util.*;

public class Main {
    private static final int BOMBS = 9;
    private static final int[] ROWS_HEAD = {1, 2, 3, 4, 5, 6};
    private static final String[] COLS_HEAD = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"};
    private static final List<String> gridCells = new ArrayList<>();
    private static final Map<String, Integer> grid = new LinkedHashMap<>();

    public static void main(String[] args) {
        // create grid
        for (int i = 0; i < COLS_HEAD.length; i++) {
            for (int j = 0; j < ROWS_HEAD.length; j++) {
                String cellName = COLS_HEAD[i] + ROWS_HEAD[j];
                gridCells.add(cellName);
                grid.put(cellName, 0);
            }
        }

        rollAndPlaceBomb();
        for (Map.Entry<String, Integer> val : grid.entrySet()) {
            System.out.println("Case " + val.getKey() + " : " + val.getValue());
        }
    }

    /*
     * This function shuffles gridCells and place bombs on them.
     */
    private static void rollAndPlaceBomb() {
        // Mélange la liste des cellules
        Collections.shuffle(gridCells);
        // Place les bombes sur les BOMBS premières cellules après mélange
        for (int i = 0; i < BOMBS; i++) {
            grid.put(gridCells.get(i), -1);
        }
    }
}
