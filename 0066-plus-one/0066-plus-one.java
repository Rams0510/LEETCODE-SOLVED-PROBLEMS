class Solution {
    public int[] plusOne(int[] digits) {
        // String s="";
        // for(int d:digits){
        //     s+=Integer.toString(d);
        // }
        // int n=Integer.parseInt(s);
        // n=n+1;
        // int i=0;
        // while(n>0 && i<digits.length){
        //     int t=n%10;
        //     digits[i]=t;
        //     i++;
        //     n=n/10;
        // }
        // int[] arr=new int[digits.length];
        // for(int j=0;j<digits.length;j++){
        //     arr[j]=digits[digits.length-1-j];
        // }
        // return arr;
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;
        return newDigits;
    }
}