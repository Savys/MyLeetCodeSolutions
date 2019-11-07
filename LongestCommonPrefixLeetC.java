/**
 * 
 */
package com.savitha.leetcode;

/**
 * Leet Code Easy:
 * 1.Search in  all strings
 * 2.Take the length of the first string.
 * 3.Itirate to this length.
 *      Get the first character of the first string
 *      Iterate over all other strings
 *      Match the character with all other strings.
 *      If matched append to result , else break
 */
public class LongestCommonPrefixLeetC {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//String[] s = { "flower", "flow", "flght" };
		String[] s = { "flower", "flow", "flght" };
		LongestCommonPrefixLeetC longestEng = new LongestCommonPrefixLeetC();
		String output = longestEng.findLongest(s);
		System.out.println(output);

	}

	public String findLongest(String[] strs) {

		int strsLen = strs.length;
		System.out.println("strsLen: " + strsLen);
		if (strsLen == 0) {
			return "";
		}

		int l = strs[0].length();

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < l; i++) {
			char ch = strs[0].charAt(i);
			boolean matched = true;
			for (int j = 1; j < strsLen; j++) {
				if (i >= strs[j].length() || ch != strs[j].charAt(i)) {
					matched = false;
					break;
				}
			}
			if (!matched) {
				break;
			}
			sb.append(ch);
		}

		return sb.toString();
	}

}
