public class Application {

    public static void main(String[] args) {
        SumCalculator sumCalculator = new SumCalculator();
        try {
            int sum = sumCalculator.sum(0);
            System.out.println("sum = " + sum);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
