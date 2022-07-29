class Solution {
    public int[] shortestToChar(String s, char c) {
        List<Integer> l = new ArrayList<>();
        int n = s.length();
        
        l.add(-10000);
        for(int i =0; i <n; i++){
            if(s.charAt(i) == c){
                l.add(i);
            }
        }
        l.add(Integer.MAX_VALUE);
        
        int[] result = new int[n];
        
        int first = l.get(0);
        int second = l.get(1);
        
        int k =2;
        for(int i =0; i<n;i++){
            if(s.charAt(i) != c){
                result[i] = Math.min(i-first, second-i);
            }
            else{
                first = second;
                second = l.get(k++);
            }
        }
        return result;
    }
}