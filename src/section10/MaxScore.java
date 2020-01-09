package section10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxScore {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String playerName = null;
        long runs = 0L;
        HashMap<String, Long> hm = new HashMap<String, Long>();

        System.out.println("Enter the number of players");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            sc.nextLine();
            System.out.println("Enter the details of the player" + i);
            playerName = sc.nextLine();
            runs = sc.nextLong();
            hm.put(playerName, runs);
        }
        ArrayList<String> key = new ArrayList<String>();
        ArrayList<Long> Value = new ArrayList<Long>();
        LinkedHashMap<String, Long> lhm = new LinkedHashMap<String, Long>();
        lhm.putAll(hm);
        for (Map.Entry<String, Long> e : lhm.entrySet()) {
            key.add(e.getKey());
            Value.add(e.getValue());

        }
        long max = Collections.max(Value);
        int index = -1;
        for (int i = 0; i < key.size(); i++) {
            if (max == Value.get(i)) {
                index = i;
                break;
            }
        }

        System.out.println(key.get(index));
        sc.close();
    }

}
