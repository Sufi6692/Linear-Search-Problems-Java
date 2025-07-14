public class Find_Peak_Element {

        public static void main(String[] args) {
            int[] arr = {1, 3, 20, 4, 1, 0};
            int peak = findPeak(arr);
            System.out.println("Peak element: " + peak);
        }

        static int findPeak(int[] arr) {
            int n = arr.length;

            // Check first element
            if (n == 1 || arr[0] >= arr[1]) {
                return arr[0];
            }

            // Check middle elements
            for (int i = 1; i < n - 1; i++) {
                if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
                    return arr[i];
                }
            }

            // Check last element
            if (arr[n - 1] >= arr[n - 2]) {
                return arr[n - 1];
            }

            return -1; // In case no peak is found (shouldn't happen for valid input)
        }
    }

