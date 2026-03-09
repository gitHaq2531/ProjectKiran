package practice;

import java.util.LinkedList;

public class ValidParanthesis 
{
public static void main(String[] args) 
{
	String s="{[]{][][]{}[}}";
	LinkedList<Character> list=new LinkedList<Character>();
	for(int i=0;i<s.length();i++)
	{
		list.add(s.charAt(i));
	}
	System.out.println(list);

	boolean flag=true;
	while(flag)
	{
		int size=list.size();
	for (int i=0;i<list.size();i++) {
		if(list.get(i)=='{' && list.indexOf('}')>=0)
		{
			list.remove(i);
			list.remove(list.indexOf('}'));
		}
		else if(list.get(i)=='[' && list.indexOf(']')>=0)
		{
			list.remove(i);
			list.remove(list.indexOf(']'));
		}
		else if(list.get(i)=='(' && list.indexOf(')')>=0)
		{
			list.remove(i);
			list.remove(list.indexOf(')'));
		}
	}
	if(size==list.size()) {
		flag=false;
	}
	}
	
	if(list.size()>0) {
		System.out.println("String is not balanced");
	}else {
		System.out.println("string is balanced");
	}
	
	
	System.out.println(list);
}
}
