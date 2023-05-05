import java.util.ArrayList;

public class CountPassengers {
    public static int countPassengers(ArrayList<int[]> stops) {
        //Code here!
        int remainPeople = 0;
        for (int[] stop:stops) {
            remainPeople += stop[0];
            remainPeople -= stop[1];
        }
        return remainPeople;
    }
}
