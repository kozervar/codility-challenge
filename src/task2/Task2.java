package task2;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by kozervar on 26.03.16.
 */
public class Task2 {

    public int execute(int A, int B) {
        List<Character> sa = Integer.toString(A).chars().mapToObj(i -> (char) i).collect(Collectors.toList());
        List<Character> sb = Integer.toString(B).chars().mapToObj(i -> (char) i).collect(Collectors.toList());

        StringBuilder builder = new StringBuilder();
        if(sa.size() >= sb.size()) {
            for(int i = 0; i < sa.size(); i++) {
                builder.append(sa.get(i));
                if(i < sb.size()) {
                    builder.append(sb.get(i));
                }
            }
        }
        else {
            for(int i = 0; i < sb.size(); i++) {
                if(i < sa.size()) {
                    builder.append(sa.get(i));
                }
                builder.append(sb.get(i));
            }
        }
        return Integer.parseInt(builder.toString());
    }
}
