/**
 * 
 */
package com.zxl.Test;

import com.zxl.service.Service;

/**
 * @author zhangxl
 * @date： 日期：2017-3-27
 * @version 1.0
 */
public class ServicrTest {

	/**
	 * 
	 * @author zhangxl
	 * @date： 日期：2017-3-27
	 * @return void
	 * @param args
	 */
	public static void main(String[] args) {
		
		Service service=new Service();
		
		//String s="";
		//String s="abcabcbb";
		//String s="aaaaaa";
		String s = "qwertyuioplkjhgfdsazxcvbnml";
		int theLongestSubstring = service.theLongestSubstring(s);
		System.out.println(theLongestSubstring);
		

	}

}
