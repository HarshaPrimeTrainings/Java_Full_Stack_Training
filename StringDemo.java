

public class StringDemo {

	public static void main(String[] args) {
		String msg = "Hello";
		System.out.println("   HashCODE for :: "+ msg  + " :: " + msg.hashCode());
		msg = msg.concat(" All");
		System.out.println("   HashCODE for :: "  + msg + " :: " +  msg.hashCode());
		
		System.out.println(" ==== String Buffer =====");
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println("   HashCODE for :: "+ sb  + " :: " + msg.hashCode());
		sb.append(" All");
		System.out.println("   HashCODE for :: "+ sb  + " :: " + msg.hashCode());
		
		System.out.println(" ==== String Builder =====");
		StringBuilder sbl = new StringBuilder("Hello");
		System.out.println("   HashCODE for :: "+ sbl  + " :: " + msg.hashCode());
		sbl.append(" All");
		System.out.println("   HashCODE for :: "+ sbl  + " :: " + msg.hashCode());

	}
}
