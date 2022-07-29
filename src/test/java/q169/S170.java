package q169;
//cikmis
//package clothing;
//
//public class Shirt {
//	public static String getColor() {
//return "Green";
//
//}
//}
//package clothing.pants;
//
////line n1
//import clothing.shirt;
//public class S170 {
//
//	public void matchShirt() {
//		//line n2
//		String color= Shirt.getColor();
//		if(color.equals("Green")) {
//			System.out.println("FIT");
//		}
//	}
//
//	public static void main(String[] args) {
//		S170 trouser = new S170 ();
//		trouser.matchShirt();
//
//	}
//
//}
////Answer
////A). At line n1 insert: import clothing.Shirt;At line n2 insert: String color = Shirt.getColor();
////C). At line n1 insert: import static clothing.Shirt.getColor;At line n2 insert: String color = getColor();
