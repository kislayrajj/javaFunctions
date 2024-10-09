package functions;

public class InfiniteLoop {
    public static void infiniteLoop() {
        int count = 0;
        while (1 < 2) {
            count++;
            System.out.println(count);
        }
    }

    public static void main(String[] args) {
        infiniteLoop();
    }
}
