package com.test.mybatis.test;

public class Test12 {
	/*
	 * ����һ���ַ��� s���ҵ� s ����Ļ����Ӵ�������Լ��� s ����󳤶�Ϊ 1000��

		ʾ�� 1��
		
		����: "babad"
		���: "bab"
		ע��: "aba" Ҳ��һ����Ч�𰸡�
		
		ʾ�� 2��
		
		����: "cbbd"
		���: "bb"
		
	 * */
	public static void main(String[] args) {
		new Test12().find();
	}

	private void find() {
		/*
		 * ��������Ӵ�
		 * 		�������е�Ԫ��
		 * 		��ÿһ��Ԫ��Ѱ��������ͬ������һ���ַ�
		 * 		�ҵ��߱�������������е��Ӵ�
		 * 		��ת���Ƚ�
		 * 			��ͬ��ˢ�»����Ӵ�
		 * 			��ͬ������
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
	 * ���Ὣstring�滻Ϊs
	 * */
	private String action(String s) {
		/*
		 * ������ͬ�ַ����Ӵ�
		 *		��ת���Ƚϣ�ˢ���Ӵ�
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
