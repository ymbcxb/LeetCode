import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++) {
        	if(i>0&&nums[i]==nums[i-1]) {
        		continue;
        	}
        	int l = i+1;
        	int r = nums.length-1;
        	while(l<r) {
        		int sum = nums[i]+nums[l]+nums[r];
        		if(sum==0) {
        			List<Integer> list = new ArrayList<>();
        			list.add(nums[i]);
        			list.add(nums[l]);
        			list.add(nums[r]);
        			result.add(list);
        		}else {
        			while(l<r && nums[l]==nums[l+1])l++;
        			while(l<r && nums[r]==nums[r-1])r--;
        			if(sum>0)r--;
        			if(sum<0)l++;
        		}
        	}
        }
        return result;
    }
	public static void main(String[] args) {
		int [] a = {-1,0,1,2,-1,-4};
		System.out.println(threeSum(a));
	}
}