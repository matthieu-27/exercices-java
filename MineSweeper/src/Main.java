import java.util.*;

public class Main {

    private static int BOMBS = 9;

    private static int[] ROWS_HEAD = {1, 2, 3, 4, 5, 6};
    private static String[] COLS_HEAD = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"};

    public static void main(String[] args) {
        // create grid
        LinkedHashMap<String, Integer> grid = new LinkedHashMap<>();

        for (int i = 0; i < COLS_HEAD.length; i++) {
            for (int j = 0; j < ROWS_HEAD.length; j++) {
                String cellName = COLS_HEAD[i] + ROWS_HEAD[j];
                grid.put(cellName, 0);
            }
        }

        for(String cell : grid.keySet()){
            System.out.println(cell);
        }

    }
}
