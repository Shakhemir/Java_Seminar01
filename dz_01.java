import java.util.Arrays;

public class dz_01 {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 3, 0, 4, 5, 0 };
        duplicateZeros(arr);
    }

    public static void duplicateZeros(int[] arr) {
        int[] copyArr = Arrays.copyOf(arr, arr.length);
        int index = 0, i = 0;
        while (i < arr.length) {
            arr[i++] = copyArr[index];
            if (copyArr[index++] == 0) {
                arr[i++] = 0;
            }
        }
    }

    public int removeElement(int[] nums, int val) {
        int k = nums.length;
        int index = 0;
        while (index < k) {
            if (nums[index] == val) {
                nums[index] = nums[--k];
                nums[k] = -1;
            } else {
                index++;
            }
        }
        return k;
    }

    public String reverseWords(String s) {
        String reversed = "", word = "";
        Boolean notSpace = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' '){
                word += s.charAt(i);
                notSpace = true;
            }
            if (s.charAt(i) == ' ' || i == s.length() - 1 && notSpace) {
                notSpace = false;
                reversed = word + " " + reversed;
                word = "";
            }
        }
        return reversed.trim();
    }
}