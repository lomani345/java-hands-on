package section6;

public class Delivery {
    String bowler;
    String batsman;
    long runs;

    void displayDeliveryDetails(String bowler, String batsman) {
        String nameParts[] = bowler.split(" ");
        String lastName = nameParts[1];
        System.out.println("Bowler:" + lastName);
        String namePart[] = batsman.split(" ");

        String lastNames = namePart[1];
        System.out.println("Batsman:" + lastNames);
    }

    void displayDeliveryDetails(Long runs) {
        if (runs == 6) {
            System.out.println("Its a sixer");
        }
        if (runs == 4) {
            System.out.println("Its a boundry");
        } else {
            System.out.println("Number of runs scored in the delivery" + runs);
        }
    }
}
