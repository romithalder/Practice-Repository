package Pracctice;

import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String dataStream=in.nextLine();
		int result=unaffectedChar(dataStream);// int result=answer;
		System.out.println(result);
	}
	//alphxxdida
	//adidxxhpla
	
	public static int unaffectedChar(String dataStream) {
		// TODO Auto-generated method stub
		int answer=0;int j=0;
		char ch[]=dataStream.toCharArray(); //a,l,p,h,x,x,d,i,d,a
		for(int i=dataStream.length()-1;i>=0;i--) {
			if(dataStream.charAt(i)==ch[j++]) {
				answer++;
			}
		}
		return answer;
	}
}
//def unaffectedChar(dataStream):
//    ans = 0
//    if len(dataStream)%2 == 0:
//        length = len(dataStream)//2
//    else:
//        length = len(dataStream) //2 + 1
//        ans = -1
//    for i in range(length):
//        if dataStream[i] == dataStream[len(dataStream)-i-1]:
//            ans = ans + 2
//    return ans
