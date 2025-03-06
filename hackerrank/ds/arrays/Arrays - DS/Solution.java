import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    
    /*
     * My approach (Two-pointer approach)
     * 
     * O(n/2) -> O(n) time complexity
     * O(1) complexity, since it performs in-place
     * 
     */
    public static List<Integer> reverseArray(List<Integer> a) {
        int pLeft = 0;
        int pRight = a.size() - 1;
        Integer temp;

        while (pRight > pLeft) {
            temp = a.get(pRight);
            a.set(pRight, a.get(pLeft));
            a.set(pLeft, temp);

            pLeft++;
            pRight--;
        }

        return a;
    }


    /*
     * Collections approach (Two-pointer approach)
     * 
     * O(n) time complexity
     * O(1) complexity, since it  also performs in-place
     * 
     * Differences:
     * 
     * Uses a built-in method
     * More concise
     * 
     */
    public static List<Integer> reverseArrayUsingCollections(List<Integer> a) {
        Collections.reverse(a);

        return a;
    }

    
    /*
     * Functional approach (Two-pointer approach)
     * 
     * O(n) time complexity
     * O(n) complexity, since it creates a new list
     * 
     * Differences:
     * 
     * Uses more memory
     * Kinda more complex
     * 
     */
    public static List<Integer> reverseArrayUsingFunctional(List<Integer> a) {
        return IntStream.range(0, a.size())
            .map(i -> a.get(a.size() - 1 - i))
            .boxed()
            .collect(Collectors.toList());
    }
    

    /*
     * Stack approach (Two-pointer approach)
     * 
     * O(n) time complexity, iterates twice (push and pop)
     * O(n) complexity, since it keeps all the elems in the stack and in the new list
     * 
     * Differences:
     * 
     * Uses more memory
     * More complex than needed
     * Shows u know datastrctures such as Stack (ego coding ¯\_(ツ)_/¯)
     * 
     */
    public static List<Integer> reverseArrayUsingStack(List<Integer> a) {
        Stack<Integer> stack = new Stack<>();
        a.forEach(stack::push);

        List<Integer> result = new ArrayList<>();
        
        while (!stack.isEmpty()) {
            result.add(stack.pop());
        }

        return result;
    }

}
