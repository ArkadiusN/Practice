package LeetCode;

public class HammingDistance {
    public static void main(String[] args) {
        hammingDistance(1, 4);
        hammingDistance(3, 1);
    }

    public static int hammingDistance(int x, int y) {
        int counter = 0, i = 0;
        while (i < 32) {
            int bitX = (x >> i) & 1, bitY = (y >> i) & 1;
            if (bitX != bitY) {
                counter++;
            }
            i++;
        }
        return counter;
    }
}
