package recursion;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

public class fibonnaci {

	static int fibo(int n) {
		if(n==1) return 0;
		if(n==2) return 1;
		return fibo(n-1) + fibo(n-2);
	}
	public static void main(String[] args) {
//		int rs =fibo(8);
//		System.out.println(rs);
//		String t;
//		t="eyufhiugh";
//		int[] a=new int[2];
//	
//		Set<Integer> set = new HashSet<>();
//        Queue<Integer> q = new ArrayDeque<>();
//        Map<String,Integer> map = new HashMap<>();
//        set.add(34);
//        set.contains(5);
//        map.put("a",1);
//        map.get(map);
//		Stack<Integer> s = new Stack<>();
//		s.push(1);
//		s.push(2);
//		s.push(3);
//		s.push(4);
//		System.out.println(s.indexOf(4));
//		s.peek(); 
		String s="abba";
		Queue<Character> q = new ArrayDeque<>();
        Map<Character,Integer> map = new HashMap<>();
        q.add(s.charAt(0)); 
       
        map.put(s.charAt(0),1);
        
        for(int i=1;i<s.length();i++){
        	if(map.containsKey(q.peek()) && map.get(q.peek())>1) q.remove();
        	if(map.containsKey(s.charAt(i))) {
        		map.replace(s.charAt(i), map.get(s.charAt(i))+1);
        	}
        	else {
        		map.put(s.charAt(i),1);
        		q.add(s.charAt(i));
        	}
//            System.out.println(q);
        }
        for(int i = 0; i<s.length(); i++) {
            if(map.get(s.charAt(i))==1) {
                System.out.println(i);
            }
        }
        System.out.println(-1);
	}
}
		
	


//0 1 1 2 3 5 8 13  