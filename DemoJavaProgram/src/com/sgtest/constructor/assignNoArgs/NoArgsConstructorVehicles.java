package com.sgtest.constructor.assignNoArgs;

    class TwoWheeler1
    {
        String TWheelerName;
        String TWheelerType;
        int TWmileage;
        int TWSpeed;

        TwoWheeler1()
        {
            TWheelerName="RX100 ";
            TWheelerType="Petrol Engine";
            TWmileage=35;
            TWSpeed=110;
            System.out.println("Two wheeler name : "+TWheelerName);
            System.out.println("Two wheeler type : "+TWheelerType);
            System.out.println("Two wheeler mileage per liter km : "+TWmileage);
            System.out.println("Two wheeler Speed per hour kmph: "+TWSpeed);
            System.out.println("---------------------------------------------");
        }
    }
    class FourWheeler1
    {
        String FWheelerName;
        String FWheelerType;
        int FWmileage;
        int FWSpeed;

        FourWheeler1() {
            FWheelerName = "Mahindra Thar 4X4";
            FWheelerType = "Diesel";
            FWmileage = 17;
            FWSpeed = 155;
            System.out.println("Four Wheeler Name : " + FWheelerName);
            System.out.println("Engine Type : " + FWheelerType);
            System.out.println("Mileage of Four wheeler Kmpl : " + FWmileage);
            System.out.println("Speed of Four Wheeler Kmph : " + FWSpeed);
            System.out.println("--------------------------------------------");
        }
    }
    class HeavyVehicle1
    {
        String HVName;
        String HVtype;
        int noOfWheeles;
        int HVweight;

        HeavyVehicle1()
        {
            HVName="TATA Signa 4081.S";
            HVtype="Diesel";
            HVweight=39500;
            noOfWheeles=6;
            System.out.println("Heavy vehicle Name : "+HVName);
            System.out.println("Type of Engine : "+HVtype);
            System.out.println("Gross Weigth of Vehicle : "+HVweight);
            System.out.println("No.s of Wheeles : "+noOfWheeles);
        }
    }
public class NoArgsConstructorVehicles
{
    public static void main(String[] args)
    {
        TwoWheeler1 tw=new TwoWheeler1();

        FourWheeler1 fw = new FourWheeler1();

        HeavyVehicle1 hv=new HeavyVehicle1();


    }
}
