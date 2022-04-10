package com.greatlearning.denominations.model;

public class MergeSort {
    private void merge(int arr[], int left, int mid, int right)
    {
        int leftArrSize = mid - left + 1;
        int rightArrSize = right - mid;
  
        int leftArray[] = new int[leftArrSize];
        int rightArray[] = new int[rightArrSize];
  
        for (int i = 0; i < leftArrSize; ++i)
            leftArray[i] = arr[left + i];
        for (int j = 0; j < rightArrSize; ++j)
            rightArray[j] = arr[mid + 1 + j];
  
        int i = 0, j = 0;
  
        int mergedArrIndex = left;
        while (i < leftArrSize && j < rightArrSize) {
            if (leftArray[i] > rightArray[j]) {
                arr[mergedArrIndex] = leftArray[i];
                i++;
            }
            else {
                arr[mergedArrIndex] = rightArray[j];
                j++;
            }
            mergedArrIndex++;
        }

        while (i < leftArrSize) {
            arr[mergedArrIndex] = leftArray[i];
            i++;
            mergedArrIndex++;
        }

        while (j < rightArrSize) {
            arr[mergedArrIndex] = rightArray[j];
            j++;
            mergedArrIndex++;
        }
    }
  
    public void sort(int arr[], int l, int r)
    {
        if (l < r) {
        	
            int m =l+ (r-l)/2;
  
            sort(arr, l, m);
            sort(arr, m + 1, r);
 
            merge(arr, l, m, r);
        }
    }
}
