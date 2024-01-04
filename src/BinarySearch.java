import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] whitelist = In.readInts(args[0]);
        Arrays.sort(whitelist);
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (rank(key, whitelist) < 0) {
                StdOut.println(key);
            }
        }
    }

    /**
     * Common rank() method used for BinarySearch.
     * <br>
     * Complexity of <b>O(LogN)</b>
     *
     * @param key value we seek.
     * @param arr array we have to go through in order to search the key.
     * @return the key value, otherwise -1 if the value does not exist.
     */
    public static int rank(int key, int[] arr) {
        int lo = 0, hi = arr.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < arr[mid]) hi = mid - 1;
            else if (key > arr[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    /**
     * Brute force approach to seek the value.
     * <br>
     * Complexity of <b>O(N)</b>
     *
     * @param key value we seek.
     * @param arr array we have to go through in order to search the key.
     * @return the key value, otherwise -1 if the value does not exist.
     */
    public static int rank2(int key, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int val(){
        return ( 0 + 15 ) / 2;
    }

}
