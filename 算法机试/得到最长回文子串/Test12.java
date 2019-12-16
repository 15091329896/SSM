package com.test.mybatis.test;

public class Test12 {
	/*
	 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。

		示例 1：
		
		输入: "babad"
		输出: "bab"
		注意: "aba" 也是一个有效答案。
		
		示例 2：
		
		输入: "cbbd"
		输出: "bb"
		
	 * */
	public static void main(String[] args) {
		new Test12().find();
	}

	private void find() {
		/*
		 * 找最长回文子串
		 * 		遍历所有的元素
		 * 		对每一个元素寻找与它相同的另外一个字符
		 * 		找到具备这个特征的所有的子串
		 * 		翻转，比较
		 * 			相同：刷新回文子串
		 * 			不同：跳过
		 * "aaabaaaa"

		 * "abcdbbfcba"
"zudfweormatjycujjirzjpyrmaxurectxrtqedmmgergwdvjmjtstdhcihacqnothgttgqfywcpgnuvwglvfiuxteopoyizgehkwuvvkqxbnufkcbodlhdmbqyghkojrgokpwdhtdrwmvdegwycecrgjvuexlguayzcammupgeskrvpthrmwqaqsdcgycdupykppiyhwzwcplivjnnvwhqkkxildtyjltklcokcrgqnnwzzeuqioyahqpuskkpbxhvzvqyhlegmoviogzwuiqahiouhnecjwysmtarjjdjqdrkljawzasriouuiqkcwwqsxifbndjmyprdozhwaoibpqrthpcjphgsfbeqrqqoqiqqdicvybzxhklehzzapbvcyleljawowluqgxxwlrymzojshlwkmzwpixgfjljkmwdtjeabgyrpbqyyykmoaqdambpkyyvukalbrzoyoufjqeftniddsfqnilxlplselqatdgjziphvrbokofvuerpsvqmzakbyzxtxvyanvjpfyvyiivqusfrsufjanmfibgrkwtiuoykiavpbqeyfsuteuxxjiyxvlvgmehycdvxdorpepmsinvmyzeqeiikajopqedyopirmhymozernxzaueljjrhcsofwyddkpnvcvzixdjknikyhzmstvbducjcoyoeoaqruuewclzqqqxzpgykrkygxnmlsrjudoaejxkipkgmcoqtxhelvsizgdwdyjwuumazxfstoaxeqqxoqezakdqjwpkrbldpcbbxexquqrznavcrprnydufsidakvrpuzgfisdxreldbqfizngtrilnbqboxwmwienlkmmiuifrvytukcqcpeqdwwucymgvyrektsnfijdcdoawbcwkkjkqwzffnuqituihjaklvthulmcjrhqcyzvekzqlxgddjoir"

		 * bbfcb
		 * "iptmykvjanwiihepqhzupneckpzomgvzmyoybzfynybpfybngttozprjbupciuinpzryritfmyxyppxigitnemanreexcpwscvcwddnfjswgprabdggbgcillisyoskdodzlpbltefiz"
"cbcdcbedcbc"
"kztakrekvefgchersuoiuatzlmwynzjhdqqftjcqmntoyckqfawikkdrnfgbwtdpbkymvwoumurjdzygyzsbmwzpcxcdmmpwzmeibligwiiqbecxwyxigikoewwrczkanwwqukszsbjukzumzladrvjefpegyicsgctdvldetuegxwihdtitqrdmygdrsweahfrepdcudvyvrggbkthztxwicyzazjyeztytwiyybqdsczozvtegodacdokczfmwqfmyuixbeeqluqcqwxpyrkpfcdosttzooykpvdykfxulttvvwnzftndvhsvpgrgdzsvfxdtzztdiswgwxzvbpsjlizlfrlgvlnwbjwbujafjaedivvgnbgwcdbzbdbprqrflfhahsvlcekeyqueyxjfetkxpapbeejoxwxlgepmxzowldsmqllpzeymakcshfzkvyykwljeltutdmrhxcbzizihzinywggzjctzasvefcxmhnusdvlderconvaisaetcdldeveeemhugipfzbhrwidcjpfrumshbdofchpgcsbkvaexfmenpsuodatxjavoszcitjewflejjmsuvyuyrkumednsfkbgvbqxfphfqeqozcnabmtedffvzwbgbzbfydiyaevoqtfmzxaujdydtjftapkpdhnbmrylcibzuqqynvnsihmyxdcrfftkuoymzoxpnashaderlosnkxbhamkkxfhwjsyehkmblhppbyspmcwuoguptliashefdklokjpggfiixozsrlwmeksmzdcvipgkwxwynzsvxnqtchgwwadqybkguscfyrbyxudzrxacoplmcqcsmkraimfwbauvytkxdnglwfuvehpxd"

"bcdcb"

		 * */
		
		String string = "kztakrekvefgchersuoiuatzlmwynzjhdqqftjcqmntoyckqfawikkdrnfgbwtdpbkymvwoumurjdzygyzsbmwzpcxcdmmpwzmeibligwiiqbecxwyxigikoewwrczkanwwqukszsbjukzumzladrvjefpegyicsgctdvldetuegxwihdtitqrdmygdrsweahfrepdcudvyvrggbkthztxwicyzazjyeztytwiyybqdsczozvtegodacdokczfmwqfmyuixbeeqluqcqwxpyrkpfcdosttzooykpvdykfxulttvvwnzftndvhsvpgrgdzsvfxdtzztdiswgwxzvbpsjlizlfrlgvlnwbjwbujafjaedivvgnbgwcdbzbdbprqrflfhahsvlcekeyqueyxjfetkxpapbeejoxwxlgepmxzowldsmqllpzeymakcshfzkvyykwljeltutdmrhxcbzizihzinywggzjctzasvefcxmhnusdvlderconvaisaetcdldeveeemhugipfzbhrwidcjpfrumshbdofchpgcsbkvaexfmenpsuodatxjavoszcitjewflejjmsuvyuyrkumednsfkbgvbqxfphfqeqozcnabmtedffvzwbgbzbfydiyaevoqtfmzxaujdydtjftapkpdhnbmrylcibzuqqynvnsihmyxdcrfftkuoymzoxpnashaderlosnkxbhamkkxfhwjsyehkmblhppbyspmcwuoguptliashefdklokjpggfiixozsrlwmeksmzdcvipgkwxwynzsvxnqtchgwwadqybkguscfyrbyxudzrxacoplmcqcsmkraimfwbauvytkxdnglwfuvehpxd";
		String hui = action(string);
		System.out.println(hui);
	}

	/*
	 * 待会将string替换为s
	 * */
	private String action(String s) {
		/*
		 * 根据相同字符找子串
		 *		翻转；比较；刷新子串
		 *
		 * */
		return deal(s);
	}

	private String deal(String s) {
		if(s.length() == 0) {
			return s;
		}
		StringBuffer huiBuffer = new StringBuffer();
		huiBuffer.append(s.charAt(0));
		for (int i = 0; i < s.length(); i++) {
			flushHuiBuffer(i, s, huiBuffer);
		}
		return huiBuffer.toString();
	}

	private void flushHuiBuffer(int i, String string, StringBuffer huiBuffer) {
		int lastIndexOf = string.lastIndexOf(string.charAt(i));
		if(lastIndexOf <= i) {
			return;
		}
		if(lastIndexOf > string.length() - 1) {
			return;
		}
		String substring = string.substring(i, lastIndexOf + 1);
		dealSubString(substring, huiBuffer);
	}

	private void dealSubString(String substring, StringBuffer huiBuffer) {
		dealSubStringAction(substring, huiBuffer);
		
	}

	private void dealSubStringAction(String substring, StringBuffer huiBuffer) {
		StringBuffer buffer = new StringBuffer(substring);
		for (int i = 0; i < substring.length(); i++) {
			if(reversePanDuan(buffer)) {
				if(buffer.length() > huiBuffer.length()) {
					huiBuffer.delete(0, huiBuffer.length());
					huiBuffer.append(buffer);
					return;
				}
			}
			buffer.delete(substring.length() - i - 1, substring.length());
			String bufferString = buffer.toString();
		}
	}


	private Boolean reversePanDuan(StringBuffer buffer) {
		String string = buffer.toString();
		StringBuffer buffer2 = new StringBuffer(buffer.toString());
		StringBuffer reverse = buffer2.reverse();
		String string2 = reverse.toString();
		boolean equals = string.equals(string2);
		return equals;
	}
	
}
