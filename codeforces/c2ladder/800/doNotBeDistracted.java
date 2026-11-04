
import java.io.*;
import java.util.*;

public class doNotBeDistracted {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String st = sc.next();
            HashMap<Character, Boolean> map = new HashMap<Character, Boolean>();
            System.out.println(doNotBeDistracted(map, n, st));
        }

        sc.close();
    }

    public static String doNotBeDistracted(HashMap<Character, Boolean> map, int n, String st) {
        for (int j = 1; j < n; j++) {
            if (!map.containsKey(st.charAt(j - 1))) {
                map.put(st.charAt(j - 1), true);
            }
            if (st.charAt(j) != st.charAt(j - 1)) {
                if (map.containsKey(st.charAt(j))) {
                    return "NO";
                }
            }
        }
        return "YES";
    }
}
