class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
    }
     private static void merge(int[] nums, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;      
        int right = mid + 1; 

        //storing elements in the temporary array in a sorted manner//

        while (left <= mid && right <= high) {
            if (nums[left] <= nums[right]) {
                temp.add(nums[left]);
                left++;
            } else {
                temp.add(nums[right]);
                right++;
            }
        }

        // if elements on the left half are still left //

        while (left <= mid) {
            temp.add(nums[left]);
            left++;
        }

        //  if elements on the right half are still left //
        while (right <= high) {
            temp.add(nums[right]);
            right++;
        }

        // transfering all elements from temporary to arr //
        for (int i = low; i <= high; i++) {
            nums[i] = temp.get(i - low);
        }
    }
    public int countPairs(int[] nums,int low,int mid,int high)
    {
        int right=mid+1;
        int count=0;
        for(int i=low;i<=mid;i++)
        {
           while(right<=high && (long)nums[i]>2L*nums[right]) right++;
            count=count+(right-(mid+1));
        }
        return count;
        
    }
    public int mergeSort(int[] nums, int low, int high) {
        int cnt=0;
        if (low >= high) return cnt;
        int mid = (low + high) / 2 ;
        cnt+=mergeSort(nums, low, mid);  // left half
        cnt+=mergeSort(nums, mid + 1, high); // right half
        cnt+=countPairs(nums,low,mid,high);
        merge(nums, low, mid, high);  // merging sorted halves
        return cnt;
    }
}