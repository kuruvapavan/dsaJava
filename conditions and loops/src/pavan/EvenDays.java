package pavan;

public class EvenDays {
    public static void main(String[] args) {
        int daysInAugust=31;
        int evenDays=0;
        for (int i=1;i<=daysInAugust;i++){
            if (i%2==0){
                evenDays++;
            }
        }
        System.out.println("Kunal can go out with his friends on " + evenDays + " days in August.");
    }
}
