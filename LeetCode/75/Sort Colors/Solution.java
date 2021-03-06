import java.util.Arrays;

/**
 * Solution
 */
public class Solution {
    public void sortColors(int[] nums) {
        int i = 0;
        int j = 0;
        int k = nums.length-1;
        while(j<=k){
            if(nums[k] == 0){
                swap(nums,i,k);
                if(i>=j)
                    j++;
                i++;
            }else if(nums[k] == 1){
                swap(nums,j,k);
                j++;
            }
            else if(nums[k] == 2){
                k--;
            }
        }
    }
    public void swap(int [] nums , int i , int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
    public static void main(String[] args) {
        String s1=new String("xyz");
String s2=new String("xyz");
Boolean b1=s1.equals(s2);
Boolean b2=(s1==s2);
System .out.print(b1+ "" +b2); 
    }
}