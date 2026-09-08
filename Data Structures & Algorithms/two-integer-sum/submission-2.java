class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map =new HashMap<>();
        int[] arr=new int[2];
        for(int i=0;i<nums.length;i++){
            int needed=target-nums[i];
            if(map.containsKey(needed)){
                int j=map.get(needed);
                arr[0]=j;
                arr[1]=i;
                break;
            }
            map.put(nums[i],i);
        }
        return arr;
    }
}
