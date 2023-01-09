package gfg;

public class Rg {
 public static void main(String args[])
 {
	 String s;
	 s="auprmwlbjbaokxysmkcxhcjzfsaumezjhhpujwuxhudvwyafowisjvysrdhhkukmcvuunabsiszottjrpqbpfnbquuaqzuadfays6325rccrrhcpahsjvsxmjitdjskvrebczelywmjxtanetflioykjhwbrvdhwjeokeuofsryphsouzmnfuvmthakrkrthfrrgqjapbvgi365hgzegolaourbbnnixwtffsmmhxwdswwvuiiawmflayqbreffqeogfbwficuwjhzhpjsjlddnlwklamcejrmqwriuijyreencjjlr2426ahhlufhbjfsibviofdlfmnukilbpirqwwrfrnuhkufhsvileyuauuejneaeqdjacagujsxfcfoyltvmhplnjuipzmeofoondumtp6761aokkxsgysafduaamaamkmpuupbajgzpxsmcsqjlrvqxgxgsybavfxzqmzikmkctbtwaccqepmrgdkrzimpral";
     System.out.println( findSum(s));
     
     
   
 }
 public static long findSum(String s){
     
     int sum=0;
 	for(char i: s.toCharArray())
 	{
 	    
 	    if((int)i>=48 && (int)i<=57 )
 	    {
 	        sum=sum+(i-48);
 	    }
 	}
 	return sum;
     
 }
}
