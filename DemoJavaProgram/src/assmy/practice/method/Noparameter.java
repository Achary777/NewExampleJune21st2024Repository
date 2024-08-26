package assmy.practice.method;

import java.util.concurrent.Callable;

class Calculate
{
    void addition()
    {
        int x=10, y=20, res=(x+y);
        System.out.println("Addition Result : "+res);
    }

    void multiplication()
    {
        int x=2, y=5, res=(x*y);
        System.out.println("Multiplocation result : "+res);
    }
}
public class Noparameter {
    public static void main(String[] args) {
      Calculate o=new Calculate();
      o.addition();
      o.multiplication();
    }
}
