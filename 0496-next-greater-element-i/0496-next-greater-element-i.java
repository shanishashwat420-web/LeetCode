class Solution {
    public int[] nextGreaterElement(int[] a, int[] b) {
        int[] ans = new int[a.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < b.length; i++) {
            map.put(b[i], i);
        }
        
        for (int i = 0; i < a.length; i++) {
            int val = a[i];
            int idx = map.get(val);
            ans[i] = -1;
            
            for (int j = idx + 1; j < b.length; j++) {
                if (b[j] > val) {
                    ans[i] = b[j];
                    break;
                }
            }
        }
        
        return ans;
    }
}
