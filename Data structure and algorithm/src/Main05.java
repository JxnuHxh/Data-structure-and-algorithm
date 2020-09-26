public class Main05 {




        /**
         *
         * @param nums int整型一维数组
         * @return int整型
         */
        public int firstMissingPositive (int[] nums) {
            int min =0;
            for(int i = 0; i<nums.length;i++){
                if(nums[i]<=0||nums[i]>=nums.length){
                    nums[i]=0;
                }else{

                    nums[nums[i]]=nums[i];
                }
            }
            for(int i =1 ; i<nums.length;i++){
                if(nums[i]!=i)return i;
            }
            return 1;
            // write code here
        }

}

