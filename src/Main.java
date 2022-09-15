public class Main {
    public static void main(String[] args)
    {
        double creditBalance = 5000;
        double firstMonth = creditBalance + creditBalance * 0.17;
        double secondMonth = firstMonth + firstMonth * 0.17;

        System.out.println("The first month balance is " + firstMonth);
        System.out.println("The second month balance is " + secondMonth);

    }
}