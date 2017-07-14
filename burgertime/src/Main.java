/**
 * Created by Adrian.Flak on 6/13/2017.
 */
public class Main {

    public static void main(String[] args) {
        Integer []arrival = {3,3,9};
        Integer []service = {2,15,14};
        System.out.println(maxWaitTime(arrival,service));
    }

    public static int maxWaitTime (Integer [] arrival, Integer [] service){
        int overlap = 0;

        for (int i = 0; i < arrival.length; i++) {
            if(i >= arrival.length){
                return overlap;
            } else {
                overlap = Math.min(service[i + 1],service[i]) - Math.max(arrival[i + 1], arrival[i]);
            }
        }
        return overlap;
    }
}
