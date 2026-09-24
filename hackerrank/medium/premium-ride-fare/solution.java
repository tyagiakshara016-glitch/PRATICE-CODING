import java.io.*;
import java.util.*;

class Ride{
    int distance;
    int farePerKm;
    Ride(int distance,int farePerKm){
        this.distance = distance;
        this.farePerKm = farePerKm;
    }
    int calculateFare(){
        return distance * farePerKm;
    }
}
class PremiumRide extends Ride{
    int waitingMinutes;
    PremiumRide(int distance,int farePerKm,int waitingMinutes){
        super(distance, farePerKm);
        this.waitingMinutes = waitingMinutes;
    }
    @Override
    int  calculateFare(){
        return super.calculateFare()+(waitingMinutes*2);
    }
}
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner sc = new Scanner(System.in);

        int distance = sc.nextInt();
        int farePerKm = sc.nextInt();
        int waitingMinutes = sc.nextInt();
        if (distance < 1 || distance > 500 ||
            farePerKm < 1 || farePerKm > 100 ||
            waitingMinutes < 0 || waitingMinutes > 180) {
            
            System.out.println("Invalid Input");
    }else{
        PremiumRide p = new PremiumRide(distance, farePerKm, waitingMinutes);
        System.out.print("Final Fare: "+p.calculateFare());
    }
    }
}
