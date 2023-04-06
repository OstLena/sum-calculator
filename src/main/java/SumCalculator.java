public class SumCalculator {
    public int sum(int n) {

        if (n != 0) {
            int count = 1;
            int sum = 0;
            while (count <= n) {
                sum += count;
                count++;
            }
            return sum;
        } else {
            throw new IllegalArgumentException("Error, argument cannot be 0");
        }
    }
}
