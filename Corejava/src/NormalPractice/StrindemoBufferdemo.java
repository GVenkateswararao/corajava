package NormalPractice;

public class StrindemoBufferdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s1=new StringBuffer("hello");
		StringBuilder s2=new StringBuilder("hello");
		s1.append("world");
		s2.append("bye");
		System.out.println(s1);
		System.out.println(s2);
	}

}
