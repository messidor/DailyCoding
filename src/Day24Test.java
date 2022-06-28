import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Day24Test {
    public static void main(String[] args) {
        Day24 d24= new Day24();
        int[] base = new int[]{1, 2, 3, 4, 5};
        int[] sample = new int[]{6, 7};
        boolean output = d24.isSubsetOf(base, sample);
        System.out.println(output); // --> true
    }
}

class Day24 {
    public boolean isSubsetOf(int[] base, int[] sample) {
        // TODO:
        boolean result = true;
        ArrayList<Integer> arrayBase = new ArrayList<>();
        for(int i=0;i<base.length;i++){
            arrayBase.add(base[i]);
        }

        for(int i=0;i<sample.length;i++){
            if(!arrayBase.contains(sample[i])){
                result = false;
            }
        }
        return result;

    }
}
