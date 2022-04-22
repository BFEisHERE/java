
import java.util.Scanner;
public class NewMain {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        /*
        PROBLEM 1
        System.out.println("1 den 10 a kadar "+top(1,10));
        System.out.println("10 den 31 a kadar "+top(10,31));
        System.out.println("31 den 110 a kadar "+top(31,110));
        */
        /*
        PROBLEM 2
        Scanner girdi = new Scanner(System.in);
        int a1=girdi.nextInt();
        int a2=girdi.nextInt();
        int a3=girdi.nextInt();
        int a4;
        int a5;
        a4=enBuyuk(a1,a2);
        a5=enBuyuk(a3,a4);
        System.out.println("Girdiğiniz "+a1+","+a2+","+a3+ " sayılarının en büyüğü "+ a5+" dür/dir.");
        */
        
        /*
        PROBLEM 3
        Scanner girdi = new Scanner(System.in);
        System.out.println("Not Girdisi");
        double a =girdi.nextDouble();
        dersNotu(a);*/
        
       
    }
    
/* 
    PROBLEM 1 - METOD
    public static int top(int i1,int i2){
    int sonuc = 0;
    for(int i=i1;i<=i2;i++)
        sonuc +=i;
    return sonuc;   
}*/
    
/*
    PROBLEM 2 - METOD
    public static int enBuyuk(int sayı1,int sayı2){
    int sonuc;
    if(sayı1>sayı2)
        sonuc = sayı1;
    else
        sonuc = sayı2;
    return sonuc;
}*/
    /*
    PROBLEM 3 - METOT
    public static void dersNotu(double a){
        if(a>90)
            System.out.println("A");
        else if(a>=80)
            System.out.println("B");
        else if (a>=70)
            System.out.println("C");
        else if (a>=60)
            System.out.println("D");
        else if(a>=50)
            System.out.println("Yardımcı Geçti");
        else
            System.out.println("FF");
    }*/
    
    
}

