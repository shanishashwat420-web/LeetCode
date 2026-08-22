//  class Solution {
//     public String addStrings(String num1, String num2) {

//         long n1 = Integer.parseInt(num1);
//         long n2 = Integer.parseInt(num2);

//         long sum = n1 + n2;

//         return Long.toString(sum);

//     }
// }


class Solution {
    public String addStrings(String num1, String num2) {

        StringBuilder sb = new StringBuilder();

        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;

        while (i >= 0 && j >= 0) {

            int d1 = num1.charAt(i) - '0';
            int d2 = num2.charAt(j) - '0';

            int sum = d1 + d2 + carry;
            sb.append(sum % 10);
            carry = sum / 10;

            i--;
            j--;
        }

        // Agar num1 ke digits bach gaye
        while (i >= 0) {
            int d1 = num1.charAt(i) - '0';
            int sum = d1 + carry;
            sb.append(sum % 10);
            carry = sum / 10;
            i--;
        }

        // Agar num2 ke digits bach gaye
        while (j >= 0) {
            int d2 = num2.charAt(j) - '0';
            int sum = d2 + carry;
            sb.append(sum % 10);
            carry = sum / 10;
            j--;
        }

        // Last carry
        if (carry > 0) {
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}