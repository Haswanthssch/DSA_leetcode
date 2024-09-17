public class Solution {
    public void merge(int[] arr1, int m, int[] arr2, int n) {
        int len = m + n;
        int gap = (len + 1) / 2;

        while (gap > 0) {
            int left = 0;
            int right = gap;

            while (right < len) {
                if (right < m) {
                    if (arr1[left] > arr1[right]) {
                        swap(arr1, left, right);
                    }
                } else if (left < m && right < m + n) {
                    if (arr1[left] > arr2[right - m]) {
                        swap(arr1, left, right - m, arr2);
                    }
                } else if (left >= m && right >= m) {
                    if (arr2[left - m] > arr2[right - m]) {
                        swap(arr2, left - m, right - m);
                    }
                } else if (left >= m && right < m + n) {
                    if (arr2[left - m] > arr2[right - m]) {
                        swap(arr2, left - m, right - m);
                    }
                }

                left++;
                right++;
            }

            gap = (gap > 1) ? (gap + 1) / 2 : 0;
        }
        int j = 0;
        for(int i = m ; i < n+m ; i++){
            arr1[i] = arr2[j++];
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private void swap(int[] arr1, int i, int j, int[] arr2) {
        int temp = arr1[i];
        arr1[i] = arr2[j];
        arr2[j] = temp;
    }
}
