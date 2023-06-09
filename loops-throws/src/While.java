import java.util.concurrent.ThreadLocalRandom;

public class While {
    public static void main(String[] args) {
        double allowance = 50.0;
        while(allowance>0) {
            double candyValue = randomValue();
            if(candyValue > allowance)
                candyValue = allowance;

            System.out.println("Candy of value: " + candyValue + " added to the cart");
            allowance = allowance - candyValue;
        }
        System.out.println("Allowance:" + allowance);
        System.out.println("Joãozinho spent all his money on candy!");

    }
    private static double randomValue() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}

