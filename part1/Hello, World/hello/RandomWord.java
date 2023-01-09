import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

// 5개중 3개 통과 - 나중에 시간되면 수정
public class RandomWord {
    public static void main(String[] args) {
        String champion = StdIn.readString();
        int i = 1;
        if (StdIn.isEmpty()) {
            return;
        }
        while (!StdIn.isEmpty()) {
            String current_string = StdIn.readString();
            if (StdRandom.bernoulli(1 / (double) i)) {
                champion = current_string;
            }
            i++;
        }
        StdOut.println(champion);
    }
}
