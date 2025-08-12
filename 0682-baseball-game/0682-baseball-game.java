class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack=new Stack<>();
        for(String o:operations){
            switch(o){
                case "D":
                    stack.push(2*stack.peek());
                    break;
                case "C":
                    stack.pop();
                    break;
                case "+":
                    int a=stack.pop();
                    int b=stack.peek();
                    stack.push(a);
                    stack.push(a+b);
                    break;
                default:
                    stack.push(Integer.parseInt(o));
            }
        }
        int sum=0;
        for(int v:stack){
            sum+=v;
        }
        return sum;
    }
}