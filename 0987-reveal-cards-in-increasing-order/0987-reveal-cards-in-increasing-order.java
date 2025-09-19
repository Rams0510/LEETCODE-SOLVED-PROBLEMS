class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Queue<Integer> q=new LinkedList<>();
        int n=deck.length;
        int[] res=new int[n];
        for(int i=0;i<deck.length;i++){
            q.offer(i);
        }
        Arrays.sort(deck);
        for(int e:deck){
            int j=q.poll();
            res[j]=e;
            q.offer(q.poll());
        }
        return res;

    }
}