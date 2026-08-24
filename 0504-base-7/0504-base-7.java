class Solution {
    public String convertToBase7(int num) {
        int temp =Math.abs(num);
        if(num ==0) return "0";
        
        String str ="";
        while(temp>0){
            int rem =temp%7;
            str=rem+str;
            temp/=7;
        }
        if(num<0){
            str="-"+str;
        }
         
        return str;
    }
}