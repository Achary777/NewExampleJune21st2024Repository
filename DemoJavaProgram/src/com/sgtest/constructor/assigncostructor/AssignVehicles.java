package com.sgtest.constructor.assigncostructor;

    class TwoWheeler
    {
        String TWheelerName;
        String TWheelerType;
        int TWmileage;
        int TWSpeed;
    }
    class FourWheeler
    {
        String FWheelerName;
        String FWheelerType;
        int FWmileage;
        int FWSpeed;
    }
    class HeavyVehicle
    {
        String HVName;
        String HVtype;
        int noOfWheeles;
        int HVweight;
    }
public class AssignVehicles
{
    public static void main(String[] args)
    {
        TwoWheeler tw=new TwoWheeler();
            tw.TWheelerName="RX100 ";
            tw.TWheelerType="Petrol Engine";
            tw.TWmileage=35;
            tw.TWSpeed=110;
            System.out.println("Two wheeler name : "+tw.TWheelerName);
            System.out.println("Two wheeler type : "+tw.TWheelerType);
            System.out.println("Two wheeler mileage per liter km : ");
            System.out.println("Two wheeler Speed per hour kmph: "+tw.TWSpeed);
            System.out.println("---------------------------------------------");

        FourWheeler fw = new FourWheeler();
            fw.FWheelerName="Mahindra Thar 4X4";
            fw.FWheelerType="Diesel";
            fw.FWmileage=17;
            fw.FWSpeed=155;
            System.out.println("Four Wheeler Name : "+fw.FWheelerName);
            System.out.println("Engine Type : "+fw.FWheelerType);
            System.out.println("Mileage of Four wheeler Kmpl : "+fw.FWmileage);
            System.out.println("Speed of Four Wheeler Kmph : "+fw.FWSpeed);
            System.out.println("--------------------------------------------");

        HeavyVehicle hv=new HeavyVehicle();
            hv.HVName="TATA Signa 4081.S";
            hv.HVtype="Diesel";
            hv.HVweight=39500;
            hv.noOfWheeles=6;
            System.out.println("Heavy vehicle Name : "+hv.HVName);
            System.out.println("Type of Engine : "+hv.HVtype);
            System.out.println("Gross Weigth of Vehicle : "+hv.HVweight);
            System.out.println("No.s of Wheeles : "+hv.noOfWheeles);

    }
}
