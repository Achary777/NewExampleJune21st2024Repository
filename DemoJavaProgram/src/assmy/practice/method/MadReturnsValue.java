package assmy.practice.method;
class Prime
{
    boolean isPrime(int num)
    {
        boolean prime=true;
        for(int i=2; i<num; i++)
        {
            if(num%i==0)
            {
                prime=false;
                break;
            }
        }
        return prime;
    }
}
public class MadReturnsValue {
    public static void main(String[] args) {
        Prime o=new Prime();
        boolean value1=o.isPrime(23);
        System.out.println(value1);
      //  System.out.println(o.isPrime(25));
        System.out.println("------------------------------------");
    }
}
