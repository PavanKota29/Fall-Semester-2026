import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int Q = sc.nextInt();

        int minus_M = -M;

        int AC = 0;
        int Q_1 = 0;

        int N = 32;

        while (N-- > 0) {

            int QZero = Q & 1;

            if (QZero == 1 && Q_1 == 0) {
                AC = AC + minus_M;
            }
            else if (QZero == 0 && Q_1 == 1) {
                AC = AC + M;
            }

            // Save last bit of AC
            int AC_lastBit = AC & 1;

            // Save last bit of Q
            int Q_lastBit = Q & 1;

            // Arithmetic right shift AC
            AC = AC >> 1;

            // Logical right shift Q
            Q = Q >>> 1;

            // AC last bit becomes Q first bit
            Q = Q | (AC_lastBit << 31);

            // Q last bit becomes Q-1
            Q_1 = Q_lastBit;
        }

        System.out.println(Q);

    }
}
