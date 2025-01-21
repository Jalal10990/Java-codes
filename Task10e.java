public class Task10e {
    public static int binarySearch(int[] arr, int left, int right, int target) {
        
        if (left > right) {
            return -1;
        }

        
        int mid = left + (right - left) / 2;

        
        if (arr[mid] == target) {
            return mid;
        }

        
        if (arr[mid] > target) {
            return binarySearch(arr, left, mid - 1, target);
        }

        
        return binarySearch(arr, mid + 1, right, target);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 7;

        int result = binarySearch(arr, 0, arr.length - 1, target);
        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
