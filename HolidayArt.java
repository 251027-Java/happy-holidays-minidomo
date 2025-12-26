/**
 * Holiday ASCII Art Generator
 * <p>
 * Your task: Create a festive Christmas tree using ASCII characters!
 * <p>
 * Basic tree structure:
 * * <- Star on top
 * *** <- Tree branches (odd numbers of *)
 * *****
 * *******
 * ||| <- Trunk
 */
public class HolidayArt {

    public static void main(String[] args) {
        int height = args.length > 0 ? Integer.parseInt(args[0]) : 5;

        printTree(height);
        System.out.println("\nHappy Holidays!");
    }

    /**
     * Prints a Christmas tree with the given height.
     *
     * @param height Number of branch levels (not including star and trunk)
     */
    public static void printTree(int height) {
        if (height <= 1) {
            throw new RuntimeException("Height must be greater than 1");
        }
        //
        // Steps:
        // 1. Print the star on top (centered)
        // 2. Loop through each level of branches
        // - Calculate spaces needed for centering
        // - Calculate stars needed (1, 3, 5, 7, ...)
        // 3. Print the trunk (centered)

        for (int i = 1; i <= height; i++) {
            int empty = height - i;
            int leaves = i * 2 - 1;

            String spaces = " ".repeat(empty);
            String tree = "*".repeat(leaves);

            System.out.println(spaces + tree);
        }

        String trunk = " ".repeat(height - 2) + "|||";
        System.out.println(trunk);
    }
}
