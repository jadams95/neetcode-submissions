class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> gameCtrStack = new Stack<>();
        // int[] res = new int[operations.length];
        int res = 0;
        for(String s : operations){
            if(s.equals("+")){
                int top =  gameCtrStack.pop();
                int newTop = top + gameCtrStack.peek();
                gameCtrStack.push(top);
                gameCtrStack.push(newTop);
                res += newTop;


            } else if(s.equals("D")){
                gameCtrStack.push(2 * gameCtrStack.peek());
                res += gameCtrStack.peek();
            } else if(s.equals("C")){
                res -= gameCtrStack.pop();
            } else {
                // we put the default logic in the else 
                gameCtrStack.push(Integer.parseInt(s));
                res += gameCtrStack.peek();
            }
        }
        return res;
    }
}