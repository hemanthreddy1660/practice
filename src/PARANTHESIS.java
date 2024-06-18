class PARANTHESIS {
    public static void main(String[] args) {
       int[] nums = {1,0,1,1,0,1};
        System.out.println(ans(nums));
    }
    static int ans(int[] nums) {
        int count =0;
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                if(count>=ans){
                    ans=count;
                }
            }
            else {
                count=0;
            }
        }return ans;
    }
}