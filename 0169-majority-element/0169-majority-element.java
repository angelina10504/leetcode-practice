class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int candidate=0;

        for(int num:nums){
            if(count==0){
                candidate=num;
            }
            if(num==candidate){
                count++;
            }else{
                count--;
            }
        } 
        return candidate;
    }
}

//we can also sort the array and return the middle element (return nums[nums.length/2]) becuase an element that appears more tham half the time will always occupy the middle index of a sorted array.
//but sorting takes O(nlogn) time.
//above approarch is Boyer-Moore approach which takes O(n) time and O(1) space.