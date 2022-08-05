package q162;

class Q162Student {
    String name;
    int age;
}


class Test {
    public static void main(String[] args) {
        Q162Student s1 = new Q162Student();
        Q162Student s2 = new Q162Student();
        Q162Student s3 = new Q162Student();
        s1 = s3;
        s3 = s2;
	    s2=null;
        System.out.println();

    }

}

