// is wale code me kuch restriction fail ho gya hai 
// class Solution {
//     public String multiply(String num1, String num2) {
//         int n =num1.length();
//         int m =num2.length();
//         int digit1 =0;
//         int digit2 =0;
//         for(int i =0;i<n;i++){
//             char ch = num1.charAt(i);
//             digit1 =digit1*10 + (ch-'0');
//         }
//         for(int i =0;i<m;i++){
//             char ch = num2.charAt(i);
//             digit2 =digit2*10 + (ch-'0');
//         }
//         int ans = digit1*digit2;
//         String ans1 =ans+"";
//         return ans1;
//     }
// }

class Solution {
    public String multiply(String num1, String num2) {
        int n = num1.length();
        int m = num2.length();

        int[] arr = new int[n + m];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {

                int a = num1.charAt(i) - '0';
                int b = num2.charAt(j) - '0';
                int sum = arr[i + j + 1] + a * b;
                arr[i + j + 1] = sum % 10;
                arr[i + j] += sum / 10;
            }
        }

        String ans = "";
        for (int i = 0; i < arr.length; i++) {
            if (ans.length() == 0 && arr[i] == 0)
                continue;

            ans += arr[i];
        }
        return ans.length() == 0 ? "0" : ans;
    }
}