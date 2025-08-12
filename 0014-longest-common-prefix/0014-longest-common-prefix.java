class Solution {
    public String longestCommonPrefix(String[] strs) {
        // StringBuilder res=new StringBuilder();
        // Arrays.sort(strs);
        // String first=strs[0];
        // String last=strs[strs.length-1];
        // for(int i=0;i<Math.min(first.length(),last.length());i++){
        //     if(first.charAt(i)!=last.charAt(i)) return res.toString();
        //     res.append(first.charAt(i));
        // }
        // return res.toString();
        if(strs==null || strs.length==0) return "";
        for(int i=0;i<strs[0].length();i++){
            char c=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(i==strs[j].length() || strs[j].charAt(i)!=c){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }
}