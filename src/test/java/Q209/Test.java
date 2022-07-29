package Q209;

public class Test {
    int x, y;
    public Test(int x,int y){
        initialize(x,y);
    }
    public void  initialize(int x,int y){
        this.x=x*x;
        this.y=y*y;
    }
    public static void main(String[] args){
        int x=9,y=5;
        Test obj=new Test(x,y);
        System.out.println(x+" "+y);
    }
}/*what is the result?
A. 9 5
B. 81 25
C. compilation fails
D. 0 0
Answer A  -- pdf de aciklamsi var ama bizdekibde satir 5 te
return type olmadigindan hat veriyor
*/
