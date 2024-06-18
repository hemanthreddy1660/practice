public class sieve {
    public static void main(String[] args) {
        int n = 40;
           boolean[] nums = new boolean[n+1];
          // for(int i=2;i<nums);
           prime(n,nums);
    }
    static void prime(int n,boolean[] nums){
        for(int i=2;i<Math.sqrt(n);i++){
            if(nums[i]==false){
                for(int j=i*2;j<=n;j=j+i){
                    nums[j]=true;
                }
            }
        }
        for(int k=2;k<nums.length;k++){
            if(!nums[k]){
                System.out.println(k);
            }
        }

    }
}
