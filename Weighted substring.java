//Weighted substring
import java.util.*;
public class Main {

    static int[] values = new int[26];

    public static void main(String[] args) {

        insertValues();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Character> s = new ArrayList<>();

        formedString(s, n);
    }

    static void insertValues() {

        values[0] = 1;
        int prev = 1;

        for (int i = 1; i < 26; i++) {

            values[i] = (i + 1) * prev + prev;

            prev = values[i];
        }
    }

    static void formedString(List<Character> s, int k) {

        int low = 0;
        int high = 25;

        while (k != 0) {

            int ind = findFloor(k, low, high);

            s.add((char) (ind + 'A'));

            k = k - values[ind];
        }

        for (int i = s.size() - 1; i >= 0; i--) {
            System.out.print(s.get(i));
        }
    }

    static int findFloor(int k, int low, int high) {

        int ans = -1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (values[mid] <= k) {

                ans = mid;
                low = mid + 1;

            } else {

                high = mid - 1;
            }
        }

        return ans;
    }
}

//Weighted substring(On Hackerrank)
public static List<String> weightedUniformStrings(String s, List<Integer> queries) {

    HashSet<Integer> set = new HashSet<>();

    int count = 0;
    char previous = ' ';

    for (char ch : s.toCharArray()) {

        int weight = ch - 'a' + 1;

        if (ch == previous) {
            count++;
        } else {
            count = 1;
            previous = ch;
        }

        // Weight of the current uniform substring
        set.add(weight * count);
    }

    List<String> res = new ArrayList<>();

    for (int q : queries) {
        if (set.contains(q)) {
            res.add("Yes");
        } else {
            res.add("No");
        }
    }

    return res;
}

}
