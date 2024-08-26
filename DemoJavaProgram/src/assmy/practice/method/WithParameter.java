package assmy.practice.method;
class CalculateDemo1
{
    void addition(int x, int y)
    {
       int res=x+y;
        System.out.println(res);
    }

    void division(int a, int b)
    {
        int res=a/b;
        System.out.println(res);
    }
}
public class WithParameter {
    public static void main(String[] args) {
        CalculateDemo1 o=new CalculateDemo1();
        o.addition(10,20);
        o.division(8,2);
    }
}
