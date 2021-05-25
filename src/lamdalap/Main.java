package lamdalap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s1="Hello";
		String s2="Hi";
		StringUtils.betterstring(s1, s2, (String u,String t)->t.equals(u));
		StringUtils.betterstring(s1, s2, (String u,String t)->u.length()>t.length());
		StringUtils.betterstring(s1, s2, (String u,String t)->true);


	}

}
