class Solution {
    public int findComplement(int num) {
        String str = Integer.toBinaryString(num);
        StringBuilder sb = new StringBuilder(str);
        for(int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i) == '1') {
                sb.setCharAt(i, '0');
            } else {
                sb.setCharAt(i, '1');
            }
        }
        return Integer.parseInt(sb.toString(), 2);
    }
}