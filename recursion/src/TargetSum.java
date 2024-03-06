public class TargetSum {
        //int count=0;
        public static int findTargetSumWays(int[] nums, int target) {
            //     calculate(nums,target,0,0);
            //     return count;
            // }
            // public void calculate(int[] nums,int target,int i , int sum){
            //     if(i==nums.length){
            //         if(sum==target){
            //             count++;
            //         }
            //     }else{
            //         calculate(nums,target,i+1,sum+nums[i]);
            //         calculate(nums,target,i+1,sum-nums[i]);
            //     }
            return backtrack(nums,target,0,0);
        }
        public static int backtrack(int[] nums, int target,int index, int currSum){
            if (index==nums.length){
                if (currSum==target){
                    return 1;
                }else {
                    return 0;
                }
            }
            int add = backtrack(nums,target,index+1,currSum+nums[index]);
            int sub = backtrack(nums,target,index+1,currSum-nums[index]);

            return add+sub;
        }

    public static void main(String[] args) {
        int[] nums={1,1,1,1,1};
        int target = 3;
        System.out.println(findTargetSumWays(nums,target));
    }
    }

