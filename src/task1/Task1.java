package task1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by kozervar on 26.03.16.
 */
public class Task1 {
    public int execute(int[] A) {
        int max = Arrays.stream(A).max().getAsInt();
        List<Integer[]> matrix = Arrays.stream(A).boxed().map(i -> {
            Integer[] r = new Integer[max];
            Arrays.fill(r,0, i, 0);
            return r;
        }).collect(Collectors.toList());

        int[] stripes = new int[max];
        for(int i = 0; i < max; i++) {
            int stripe = 0;
            Integer lastValue = null;
            for(int r = 0; r < matrix.size(); r++) {
                Integer[] row = matrix.get(r);
                Integer val = row[i];
                if(r == 0 && val == null) {
                    stripe = 0;
                } else if(r + 1 == matrix.size() && val != null) {
                    stripe++;
                } else if(val == null && val != lastValue) {
                    stripe++;
                }
                lastValue = val;

            }
            stripes[i] = stripe;
            if(Arrays.stream(stripes).sum() > 10000000) {
                return -1;
            }
        }

        return Arrays.stream(stripes).sum();
    }
}
