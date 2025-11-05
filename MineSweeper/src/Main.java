import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {
    private static final int BOMBS = 9;
    private static final int[] ROWS_HEAD = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    private static final String[] COLS_HEAD = {"A", "B", "C", "D", "E", "F"};
    private static final List<String> gridCells = new ArrayList<>();
    private static final Map<String, Integer> grid = new LinkedHashMap<>();

    public static void main(String[] args) {
        // create grid
        for (int i = 0; i < ROWS_HEAD.length; i++) {
            for (int j = 0; j < COLS_HEAD.length; j++) {
                String cellName = COLS_HEAD[j] + ROWS_HEAD[i];
                gridCells.add(cellName);
                grid.put(cellName, 0);
            }
        }

        rollAndPlaceBomb();
//        for (Map.Entry<String, Integer> val : grid.entrySet()) {
//            System.out.println("Case " + val.getKey() + " : " + val.getValue());
//        }

        for (int i = 0; i < ROWS_HEAD.length + 1 ; i++) {
            for (int j = 0; j < COLS_HEAD.length + 1; j++) {
                StringBuilder str = new StringBuilder();
                str.append("|_|");
                System.out.print(str.toString());
            }
            System.out.println();
        }

    }

    /*
     * This function generate a JFrame and return it for display.
     */
    private static JFrame getFrame() {
        JFrame t = new JFrame();
        JPanel pan = new JPanel (new GridLayout(ROWS_HEAD.length, COLS_HEAD.length));
        Border blackline = BorderFactory.createLineBorder(Color.black,1);
        for(Map.Entry<String, Integer> cell : grid.entrySet()){
            JPanel ptest = new JPanel();
            ptest.setBorder(blackline);
            ptest.setToolTipText(cell.getKey());
            if(cell.getValue() == -1) ptest.setBackground(Color.RED);
            pan.add(ptest);
        }
        pan.setBorder(blackline);
        t.add(pan);
        t.setSize(450,900);
        return t;
    }

    /*
     * This function shuffles gridCells and place bombs on grid for the BOMBS first cells.
     */
    private static void rollAndPlaceBomb() {
        // Mélange la liste des cellules
        Collections.shuffle(gridCells);
        // Place les bombes sur les BOMBS premières cellules après mélange
        for (int i = 0; i < BOMBS; i++) {
            grid.put(gridCells.get(i), -1);
        }
    }

    /*
     * This method does the opposite as getNameById
     *
     * @param name a String to be found grid.getKeys()
     * @return an integer representing the cell id
     */
    private static int getIdByName(String name) {
        // loop over idToName array
        for (Map.Entry<String, Integer> entry : grid.entrySet()) {
            if (entry.getKey().equals(name)) {
                return entry.getValue();
            }
        }
        return -1; // fix
    }

    /*
     * This method does the opposite as getIdByName (lol)
     *
     * @param id an Integer representing the order of insertion in grid
     * @return a String containing cell key value
     */
    private static String getNameById(int id) {
        // loop over idToName array
        for (Map.Entry<String, Integer> entry : grid.entrySet()) {
            if (entry.getValue().equals(id)) {
                return entry.getKey();
            }
        }
        return ""; // fix
    }
}
