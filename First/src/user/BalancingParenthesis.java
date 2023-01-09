package user;

import java.util.Stack;

public class BalancingParenthesis {
	public static void main(String[] args) {
		Solution n = new Solution();
	     System.out.print(n.ispar("[])"));
	}
}
class Solution
{
    //Function to check if brackets are balanced or not.
     boolean ispar(String x)
    {
      Stack<Integer> s = new Stack<>();
      if(x.isEmpty()) {
    	  return false;
      }
      else if(x.charAt(0) == ')' || x.charAt(0) == ']' || x.charAt(0) == '}') {
    	  return false;
      }
          else {
    	  int t;
    	  for(int i=0;i<x.length();i++) {
    		  t=(int)x.charAt(i);
    		  if(x.charAt(i) == '(' || x.charAt(i) == '[' || x.charAt(i) == '{') {
    	    	  s.push(t);
    	      }
    		  else if(s.empty() && (x.charAt(i) == ')' || x.charAt(i) == ']' || x.charAt(i) == '}')) {
    			  return false;
    		  }
    		  else if((t/10)==(s.peek()/10)) {
    			  s.pop();
    			  }
    		  else return false;
    	  }
      }
      if(s.isEmpty())
      return true;
      else
    	  return false;
    }
}