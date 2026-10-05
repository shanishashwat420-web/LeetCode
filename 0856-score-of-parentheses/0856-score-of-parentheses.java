class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stk = new Stack<>();
        stk.push(0);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stk.push(0);
            } 
            else {
                int a = stk.pop();
                if (a == 0) {
                    a = 1;
                } 
                else {
                    a = 2 * a;
                }
                stk.push(stk.pop() + a);
            }
        }
        return stk.pop();
    }
}