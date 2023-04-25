import java.util.ArrayList;
import java.util.Collections;
public class lastStoneWeight {
    public int lastStoneWeight(int[] stones) 
    {
        ArrayList<Integer> listStones = new ArrayList<>();
        for (int i = 0; i < stones.length; i++) {
            listStones.add(stones[i]);
        }
        do {
            int y = Integer.MAX_VALUE;
            int x = Integer.MIN_VALUE;
            int len = listStones.size();
            
            if (len == 1 || len == 0) {
                break;
            }
            
            Collections.sort(listStones);
            x = listStones.get(len-2);
            y = listStones.get(len-1);
            
            if (y > x) {
                y = y - x;
                listStones.remove(listStones.size()-1);
                listStones.remove(listStones.size()-1);
                listStones.add(y);
            }
            else if (x == y) {
                listStones.remove(listStones.size()-1);
                listStones.remove(listStones.size()-1);
            }
        } while (listStones.size()>1);
        if (listStones.size() == 1) {
            return listStones.get(0);
        }        
        return 0;
    }

public static void main(String[] args) {
    int[] stones = {2, 7, 4, 1, 10, 1};
    lastStoneWeight lsw = new lastStoneWeight();

    System.out.println(lsw.lastStoneWeight(stones)); // expected output: 1
}
}

