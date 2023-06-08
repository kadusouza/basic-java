public class Main {
    public static void main(String[] args) {
        String plan = "M"; // M / T

        //Without the breaks  it prints de cases below the case that is true
        //Even the default case
        //Useful tyo organize when conditions adds up
        switch (plan) {
            case "T": {
                System.out.println("5Gb Youtube");
            }
            case "M": {
                System.out.println("Free Whats and Instagram");
            }
            case "B": {
                System.out.println("100 minutes of calls");
                break;
            }
            default: {
                System.out.println("Invalid plan");
            }
        }
    }
}