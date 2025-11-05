import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.*;
import java.util.List;

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
        JFrame t = getFrame();
        t.setVisible(true);
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
        return t;
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
