package q159;

//public class q159 {}
	class Book{
		int pages;
		}
	public class q159{
		 int count ;
		public void method (Book x,int k) {
			x.pages=100;
			k =200;
		}

public static void main(String[]args) {
			q159 obj =new q159();
			Book objBook= new Book();

			System.out.println(objBook.pages+":"+obj.count);
			obj.method(objBook, obj.count);
		System.out.println(objBook.pages +":"+obj.count);


		}
	}
//	A. 0:0 100:0
//
//	B. null:0 100:0
//	C. 0:0 100:200
//	D. null:null 100:null


//A
