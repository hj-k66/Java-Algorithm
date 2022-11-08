package week8.search;

import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] nums, int target, int startIdx, int endIdx){
        while(startIdx <= endIdx){
            //중간값 찾기
            int mid = (startIdx+endIdx) / 2;
            //인덱스(시작,끝) 옮기기
            if(nums[mid] > target){
                endIdx = mid - 1;
            }
            else if(nums[mid] < target){
                startIdx = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(binarySearch(nums,target,0,n-1) + 1);

    }
}
