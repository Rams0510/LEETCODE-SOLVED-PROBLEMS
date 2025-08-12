class Solution {
    public boolean hasAlternatingBits(int n) {
        int d=n%2;
        n=n/2;
        while(n>0){
            int d1=n%2;
            if(d==d1) return false;
            n=n/2;
            d=d1;
        }
        return true;
    }
}