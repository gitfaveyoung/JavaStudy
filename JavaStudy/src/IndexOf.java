class IndexOf {
	public static void main(String args[]) {
		String str = "Java 개발자 양성을 통한 취업연계과정!!";
		
		int s_idx = 0;
		int e_idx = 0;
		while(true) {
			e_idx = str.indexOf(" ", s_idx + 1);
			
			if(e_idx == -1) break;
			
			String s1 = str.substring(s_idx, e_idx);
			System.out.println(s1);
			
			s_idx = e_idx;
			
		}
	}
}