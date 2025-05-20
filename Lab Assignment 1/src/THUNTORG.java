import java.util.Scanner;

public class THUNTORG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr2D = {
                {0, 0, 10, 0, -1},
                {0, -1, 0, 0, -1},
                {-1, 0, -1, 0, 0},
                {0, -1, 7, 0, -1},
                {0, -1, 0, -1, 0}
        };

        System.out.println("Initial Map:");
        printMap(arr2D);

        int rows = arr2D.length;
        int cols = arr2D[0].length;
        int rowPos = -1, colPos = -1;

        // Finding the player's initial position (7)
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr2D[i][j] == 7) {
                    rowPos = i;
                    colPos = j;
                }
            }
        }

        int turns = 5;
        boolean won = false;

        while (turns > 0) {
            System.out.printf("Enter move %d (UP, DOWN, LEFT, RIGHT): ", (6 - turns));
            String move = sc.nextLine().toUpperCase();
            int newRow = rowPos;
            int newCol = colPos;

            // Determine new position based on the input
            if (move.equals("UP")) {
                newRow = rowPos - 1;
            } else if (move.equals("DOWN")) {
                newRow = rowPos + 1;
            } else if (move.equals("LEFT")) {
                newCol = colPos - 1;
            } else if (move.equals("RIGHT")) {
                newCol = colPos + 1;
            } else {
                System.out.println("Invalid move. Please enter UP, DOWN, LEFT, or RIGHT.");
                continue; // Skip the rest of the loop for invalid input
            }

            // Check if the player moved out of the grid
            if (newRow < 0 || newRow >= rows || newCol < 0 || newCol >= cols) {
                System.out.println("Player fell outside the playing area. Game over!");
                return;
            }

            // Check if the player stepped on a mine
            if (arr2D[newRow][newCol] == -1) {
                System.out.println("Player stepped on a mine. Game Over!");
                return;
            }

            // Check if the player found the treasure
            if (arr2D[newRow][newCol] == 10) {
                System.out.println("Treasure found. You win!");
                won = true;
                arr2D[rowPos][colPos] = 0; // Clear old position
                arr2D[newRow][newCol] = 7; // Mark new position
                printMap(arr2D);
                return;
            }

            // Update player's position
            arr2D[rowPos][colPos] = 0; // Clear previous position
            arr2D[newRow][newCol] = 7; // Set new position
            rowPos = newRow;
            colPos = newCol;

            // Print the current state of the grid
            System.out.println("Current state:");
            printMap(arr2D);

            // Decrement turns
            turns--;
        }

        // If no moves left and treasure not found
        if (!won) {
            System.out.println("Failed to find the treasure.");
        }
    }

    // Method to print the 2D grid
    public static void printMap(int[][] arr) {
        for (int[] row : arr) {
            for (int cell : row) {
                System.out.print(cell + "\t");
            }
            System.out.println();
        }
    }
}
