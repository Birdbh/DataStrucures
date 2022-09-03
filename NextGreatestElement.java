import java.util.Stack;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack();
        for(Integer num : nums){
            if (!stack.isEmpty() && stack.peek() < num){
                stack.pop();
                stack.push(-1);
            }
            stack.push(num);
        }
        return stack;
    }
}