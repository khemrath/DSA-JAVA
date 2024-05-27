package time_complexity;

public class TimeComplexityDemo {
    public static void main(String[] args) {
        TimeComplexityDemo demo = new TimeComplexityDemo();

        double now1 = System.currentTimeMillis();
        System.out.println(demo.findSum1(99999));
        System.out.println("Time taken - " + (System.currentTimeMillis() - now1) + " millesecs.");

        System.out.println();

        double now2 = System.currentTimeMillis();
        System.out.println(demo.findSum2(99999));
        System.out.println("Time taken - " + (System.currentTimeMillis() - now2) + " millesecs.");
    }

    public int findSum1(int n) {
        return n * (n + 1) / 2;
    }

    public int findSum2(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
