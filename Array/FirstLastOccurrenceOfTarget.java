//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
//LeetCode-34
import java.util.Scanner;

public class FirstLastOccurrenceOfTarget{
   
    /*
     * This method finds the FIRST (leftmost) occurrence of the
     * target element in a sorted array using Binary Search.
     *
     * We cannot simply return when the target is found because
     * there may be another occurrence of the same target on the
     * left side.
     *
     * Therefore, whenever the target is found, we store its index
     * and continue searching toward the left.
     */
    public static int firstOccurrence(int[]arr,int target){

        // Stores the total number of elements in the array.
        // arr.length gives the size of the array.
        int n= arr.length;

        /*
         * 'left' represents the starting index of the current
         * search range.
         *
         * We start from 0 because 0 is the first index of an array.
         */
        int left=0;

        /*
         * 'right' represents the ending index of the current
         * search range.
         *
         * Since the last index of an array is n-1, we initialize
         * right to n-1.
         */
        int right=n-1;

        /*
         * This variable stores the index where the target is found.
         *
         * We initialize it to -1 because -1 indicates that the
         * target has not been found.
         *
         * We need a separate variable to store the answer because
         * even after finding the target, we must continue searching
         * for an earlier occurrence.
         */
        int first=-1;

        /*
         * The Binary Search continues as long as left <= right.
         *
         * This condition means that there is still at least one
         * element remaining in the current search range.
         *
         * Once left becomes greater than right, there are no more
         * elements left to search.
         */
        while(left<=right){

            /*
             * Calculates the middle index of the current search range.
             *
             * Example:
             * left = 0, right = 6
             * mid = (0 + 6) / 2 = 3
             *
             * We use mid because Binary Search compares the target
             * with the middle element and eliminates half of the
             * search range.
             */
            int mid=(left+right)/2;

            /*
             * Checks whether the middle element is equal to target.
             *
             * If they are equal, we have found the target.
             */
            if(target==arr[mid]){

                /*
                 * Store mid in index because mid is a valid position
                 * where the target occurs.
                 *
                 * We cannot directly return mid because we are looking
                 * for the FIRST occurrence, not just any occurrence.
                 *
                 * There may be another target element somewhere before
                 * this position.
                 */
                first=mid;

                /*
                 * Move right to mid-1 so that the next Binary Search
                 * operation searches only the LEFT side.
                 *
                 * This is necessary because we want to check whether
                 * the same target occurs at an earlier index.
                 *
                 * If another occurrence is found, index will be
                 * updated with the smaller index.
                 */
                right=mid-1;
            }

            /*
             * If target is smaller than arr[mid], the target cannot
             * exist on the right side because the array is sorted.
             *
             * Therefore, we eliminate the right half and search
             * only in the left half.
             */
            else if(target<arr[mid]){

                // mid itself and everything after it can be ignored.
                right=mid-1;
            }

            /*
             * If target is greater than arr[mid], the target cannot
             * exist on the left side because the array is sorted.
             *
             * Therefore, we eliminate the left half and search
             * only in the right half.
             */
            else{

                // mid itself and everything before it can be ignored.
                left=mid+1;
            }
        }

        /*
         * Return the value stored in index.
         *
         * If the target was found, index contains the first
         * occurrence of the target.
         *
         * If the target was never found, index remains -1.
         * Therefore, -1 tells us that the target is not present.
         */
        return first;

    }


    /*
     * This method finds the LAST (rightmost) occurrence of the
     * target element in a sorted array using Binary Search.
     *
     * The logic is almost the same as firstOccurrence().
     *
     * The main difference is:
     *
     * firstOccurrence() -> after finding target, search LEFT.
     * lastOccurrence()  -> after finding target, search RIGHT.
     *
     * This allows us to find the rightmost occurrence.
     */
    public static int lastOccurrence(int[]arr,int target){

        // Stores the total number of elements in the array.
        int n= arr.length;

        /*
         * 'left' represents the starting index of the search range.
         * Initially, the search starts from index 0.
         */
        int left=0;

        /*
         * 'right' represents the ending index of the search range.
         * Initially, the search ends at index n-1.
         */
        int right=n-1;

        /*
         * Stores the index where the target is found.
         *
         * It is initialized to -1 because if the target does not
         * exist in the array, we need to return -1.
         *
         * We store the found index instead of immediately returning
         * because there may be another occurrence on the right.
         */
        int last=-1;

        /*
         * Continue Binary Search while a valid search range exists.
         */
        while(left<=right){

            /*
             * Find the middle index of the current search range.
             *
             * Binary Search uses the middle element to decide
             * which half of the array should be searched next.
             */
            int mid=(left+right)/2;

            /*
             * Checks whether the middle element is equal to target.
             */
            if(target==arr[mid]){

                /*
                 * Store mid in index because the target has been
                 * found at this position.
                 *
                 * We do not return immediately because this may
                 * not be the LAST occurrence.
                 *
                 * There may be another occurrence after mid.
                 */
                last=mid;

                /*
                 * Move left to mid+1 so that we continue searching
                 * in the RIGHT half.
                 *
                 * This is the main difference from firstOccurrence().
                 *
                 * We search for another occurrence with a larger
                 * index because we want the LAST occurrence.
                 */
                left=mid+1;
            }

            /*
             * If target is smaller than arr[mid], then the target
             * can only be present on the left side because the
             * array is sorted.
             */
            else if(target<arr[mid]){

                // Discard the right half of the search range.
                right=mid-1;
            }

            /*
             * If target is greater than arr[mid], then the target
             * can only be present on the right side.
             */
            else{

                // Discard the left half of the search range.
                left=mid+1;
            }
        
        }

        /*
         * Returns the last occurrence stored in index.
         *
         * If the target was found multiple times, index will contain
         * the largest index found because the search always continues
         * toward the right after finding the target.
         *
         * If the target is not present, -1 is returned.
         */
        return last;
    
}


    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the size of array:");
        int n=sc.nextInt();

        int[]arr=new int[n];

        System.out.print("Enter "+n+" elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter the target element:");
        int target=sc.nextInt();

        System.out.println("First occurence of the target element is at the index:"+firstOccurrence(arr,target));

        System.out.println("Last occurence of the target element is at the index:"+lastOccurrence(arr,target));

        sc.close();

    }
}