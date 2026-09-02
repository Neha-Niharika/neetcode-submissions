class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean duplicate=false;
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i:nums){
            if(map.containsKey(i)){
                duplicate=true;
            }
            map.put(i,map.getOrDefault(i,0)+1);
        }
        return duplicate;
    }
}