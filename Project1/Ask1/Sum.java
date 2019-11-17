public class Sum {
    private int sum;

    Sum() {
        sum = 0;
    }

    public void calculateSum(int n) {
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
    }

    public int getSum() {
        return sum;
    }

    public void printSum() {
        System.out.println("Sum: " + getSum());
    }
}