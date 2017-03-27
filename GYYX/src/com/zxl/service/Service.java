/**
 * 
 */
package com.zxl.service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangxl
 * @date£º ÈÕÆÚ£º2017-3-27
 * @version 1.0
 */
public class Service {
	public int theLongestSubstring(String str){
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		int maxLength=0;
		int temp=0;
		for(int i=0;i<str.length();i++){
			if(map.containsKey(str.charAt(i))){
				temp=Math.max(map.get(str.charAt(i))+1,temp);
				if(maxLength<(i-temp+1)){
					maxLength=i-temp+1;
				}
			}else{
				if(maxLength<(i-temp+1)){
					maxLength=i-temp+1;
				}
			}
			map.put(str.charAt(i), i);
		}
		return maxLength;
	}


}
