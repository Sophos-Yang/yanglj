package com.kubolab.gnss.gnssloggerR;

public class StaticGnssData {

    public static int[] Gpsprn = new int[32];
    public static int[] Bdsprn = new int[35];

    public static double[] GpsC1 = new double[32];     //伪距
    public static double[] GpsC2 = new double[32];
    public static double[] BdsC1 = new double[35];
    public static double[] BdsC2 = new double[35];

    public static double[] GpsL1 = new double[32];     //相位
    public static double[] GpsL2 = new double[32];
    public static double[] BdsL1 = new double[35];
    public static double[] BdsL2 = new double[35];

    public static double[] GpsD1 = new double[32];     //多普勒
    public static double[] GpsD2 = new double[32];
    public static double[] BdsD1 = new double[35];
    public static double[] BdsD2 = new double[35];

    public static int[] GPSTweek = new int[32];                       //时间
    public static double[] GPSTsecond = new double[32];

    public static int[] BDSTweek = new int[32];                       //时间
    public static double[] BDSTsecond = new double[32];
    public static int gpsflag;
    public static int bdsflag;
    public static int flag;
    public static int bdssvnum;
    public static int gpssvnum;


    public static int syns;

    public static void initData()
    {
        gpsflag = 0;
        bdsflag = 0;
        flag = 0;


        for (int i = 0;i<32;i++)
        {
            GPSTweek[i] = 0;
            GPSTsecond[i] = 0;
            Gpsprn[i] = 0;
            GpsC1[i] = 0;
            GpsC2[i] = 0;
            GpsL1[i] = 0;
            GpsL2[i] = 0;
            GpsD1[i] =0;
            GpsD2[i] =0;
        }
        for (int i = 0;i<35;i++)
        {
            BDSTweek[i] = 0;
            BDSTsecond[i] = 0;
            Bdsprn[i] = 0;
            BdsC1[i] = 0;
            BdsC2[i] = 0;
            BdsL1[i] = 0;
            BdsL2[i] = 0;
            BdsD1[i] =0;
            BdsD2[i] =0;
        }

    }
//
//    public static int GPSTweek;                        //时间
//    public static double GPSTsecond;

//    public int[] Gpsprn = new int[32];
//    public int[] Bdsprn = new int[35];
//
//    public double[] GpsC1 = new double[32];     //伪距
//    public double[] GpsC2 = new double[32];
//    public double[] BdsC1 = new double[35];
//    public double[] BdsC2 = new double[35];
//
//    public double[] GpsL1 = new double[32];     //相位
//    public double[] GpsL2 = new double[32];
//    public double[] BdsL1 = new double[35];
//    public double[] BdsL2 = new double[35];
//
//    public double[] GpsD1 = new double[32];     //多普勒
//    public double[] GpsD2 = new double[32];
//    public double[] BdsD1 = new double[35];
//    public double[] BdsD2 = new double[35];
//
//    public int GPSTweek;                        //时间
//    public double GPSTsecond;


}
