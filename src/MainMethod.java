import java.io.IOException;
import java.util.Scanner;

/**
 * Created by starc on 5/24/2016.
 */
public class MainMethod {
    public static void main(String[] args) throws Exception {
        int n;
        int i = 0;
        Scanner in = new Scanner(System.in);
        Tree tree = new Tree();
        if (in.hasNextInt())
            n = in.nextInt();
        else throw new IOException("Type mismatch");
        while (i < n) {
            tree.add(in.nextInt(), 0);
            i++;
        }

    }
}
