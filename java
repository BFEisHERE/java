
import java.util.Scanner;


public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {/*
        double a =6.5;
        a+=a+1;
        System.out.println(a);
        a=6;
        a/=2;
        System.out.println(a);*/
        
        /*int a=6;
        int b=a++;
        System.out.println(a);
        System.out.println(b);
        a=6;
        b=++a;
        System.out.println(a);System.out.println(b);*/
        
        
        /*int sayı1=(int)(System.currentTimeMillis()%10); //şuanki zamanın 10a bolumunden kalanı veriyor!!!!
        int sayı2=(int)(System.currentTimeMillis()/7%10);
        
        Scanner giriş=new Scanner(System.in);
        System.out.println(sayı1+"+"+sayı2+" Sonuc nedir?");
        int cevap=giriş.nextInt();
        
        System.out.println(sayı1+"+"+sayı2+"="+cevap+" sonuc "+(sayı1+sayı2==cevap));*/
        
        /*Scanner giriş=new Scanner(System.in);
        System.out.println("Bir tam sayı giriniz:");
        int sayı=giriş.nextInt();
        if (sayı%5==0) {
            System.out.println("Hifive");
        }if (sayı%2==0) {
            System.out.println("Hieven");
        }*/
        
        /*Scanner giriş=new Scanner(System.in);
        System.out.println("Bir çap giriniz:");
        int sayı=giriş.nextInt();
        final double pi=3.14159;
        if (sayı<0) {
            System.out.println("Yanlış Giriş");
        }else{
            double alan=sayı*sayı*pi;
            System.out.println("Alan:"+alan);
        }*/
           
        /*Scanner giriş=new Scanner(System.in);
        int number=giriş.nextInt();
        if (number%2==0) {
            System.out.println(number+" is even");
        }else{
            System.out.println(number+" is odd");
        }*/
        
        //Random Sayı Üretme
        
        /*int sayı1=(int)(Math.random()*10);
        int sayı2=(int)(Math.random()*10);
        int a;
        if (sayı1<sayı2) {
            a=sayı1;
            sayı1=sayı2;
            sayı2=a;
        }
        System.out.println(sayı1+"-"+sayı2+" nedir?");
        Scanner giriş=new Scanner(System.in);
        int cevap=giriş.nextInt();
        if (sayı1-sayı2==cevap) {
            System.out.println("Cevap dogru, aferin len");
        }else{
            System.out.println("Cevap Yanlış");
            System.out.println(sayı1+"-"+sayı2+" sonucu="+(sayı1-sayı2)+" olmalı... ");
        }*/
        
        /*Scanner giriş=new Scanner(System.in);
        System.out.println("Gün için bir sayı giriniz (1-7)");
        int gun=giriş.nextInt();
        switch(gun){
            case 1: System.out.println("Pazartesi");
            break;
            case 2: System.out.println("Salı");
            break;
            case 3: System.out.println("Çarşamba");
            break;
            case 4: System.out.println("Perşembe");
            break;
            case 5: System.out.println("Cuma");
            break;
            case 6: System.out.println("Cumartesi");
            break;
            case 7: System.out.println("Pazar");
            break;
        }*/
        
        //taş kağıt makas oyunu 
        
        //taş 0  kağıt 1   makas 2
        /*
        Scanner giriş=new Scanner (System.in);
        int seçim=giriş.nextInt();
        Random r=new Random();
        int pc = r.nextInt(3)+1;
        switch(pc){
            case 0:
                switch(seçim){
                    case 0: System.out.println("Aynı seçimi Yaptınız kazanan yok");
                    break;
                    case 1: System.out.println("pc taş oyuncu kağıt seçti. kazanan oyuncu");break;
                    case 2:System.out.println("pc tas oyuncu makas seçti. kazanan pc");break;
                }
            break;
            case 1: switch(seçim){
                    case 0: System.out.println("pc kağıt oyuncu taş seçti kazanan pc");
                    break;
                    case 1: System.out.println("Aynı seçimi Yaptınız kazanan yok");break;
                    case 2:System.out.println("pc kağıt oyuncu makas seçti kazanan oyuncu");
            break;}
            case 2: switch(seçim){
                    case 0: System.out.println("pc makas seçti oyuncu taş kazanan oyuncu");
                    break;
                    case 1: System.out.println("pc makas seçti oyuncu kağıt kazanan pc ");
                    break;
                    case 2:System.out.println("Aynı seçimi Yaptınız kazanan yok"); break;
            default:System.out.println("Hatalı işlme");
                    }
            }*/
    
        /*sin(radyan)=bir radyan açısını trigonometrik sinüsünü döndürür
        cos(radyan) =  "        "
        tan(radyan)= "           "
        toRadians(derece) = derece açının radyan değerini döndürür
        toDegree(radyan)= radyan açının derece değerini döndürür 
        asin(a)=  arcsin radyan
        acos(a)=  arccos  radyan
        atan(a) =  arctan radyan
        */
        /*System.out.println(Math.toDegrees(Math.PI));
        System.out.println(Math.toRadians(90));
        System.out.println(Math.sin(0));
        System.out.println(Math.sin(Math.toRadians(270)));
        System.out.println(Math.sin(Math.PI/6));
        System.out.println(Math.atan(1.0));
        System.out.println(Math.ceil(2.1)); */
        
        
        /*Scanner giriş=new Scanner (System.in);
        
        String sehir1=giriş.nextLine();
        String sehir2=giriş.nextLine();
        
        if (sehir1.compareTo(sehir2)<0) {
            System.out.println(sehir1 +"+ "+sehir2);
        }else{
            System.out.println(sehir2+"+"+sehir1);
        }*/
        
        /*int sayı=(int)(Math.random()*100);
        Scanner giriş=new Scanner (System.in);
        System.out.println("0 - 100 arasında sihirli sayı bir sayıyı tahmin ediniz");
        int tahmin=-1;
        while(tahmin!=sayı){
            System.out.print("\n Tahmin Ediniz:");
            tahmin=giriş.nextInt();
            
            if (tahmin==sayı) {
                System.out.println("Evet, sayı:"+sayı);
            }else if (tahmin>sayı) {
                System.out.println("Tahmininiz yüksek");
            }else{
                System.out.println("tahmininiz yüksek");
            }
        }*/
        /*System.out.println(" Bir tam sayı giriniz(0 gelirse giriş sonlanır) ");
        Scanner giriş=new Scanner (System.in);
        int veri=giriş.nextInt();
        int toplam=0;
        while(veri !=0){
            toplam+=veri;
            System.out.println(" Bir tam sayı giriniz(0 gelirse giriş sonlanır) ");
            veri=giriş.nextInt();
        }
        System.out.println("toplam: "+toplam);*/
           
        /*System.out.println("                tablo");
        System.out.print("      ");
        for (int i = 1; i <=9; i++) {
            System.out.print("    "+i);
            System.out.println("\n------------------------------------------------");
            
            for (int j = 1; j <=9; j++) {
                System.out.print(j+"    |   ");
                for (int k = 1; k <=9; k++) {
                    System.out.printf("%4d",k*j);
                }
                System.out.println();
            }
        }*/
        
        
        
        /*int i=1;
        while(i<8){
            for (int j = i; j >0; j--) {
                System.out.print(j+"    ");
            }
            System.out.println();
            i++;
        }*/
        
        /*double[] benimdizi=new double[5];
        Scanner giris=new Scanner(System.in);
        System.out.print("Lutfen: "+benimdizi.length+"sayı giriniz:");
        for (int i = 0; i < benimdizi.length; i++) {
            benimdizi[i]=giris.nextInt();
        }
        for (int i = 0; i < benimdizi.length; i++) {
            System.out.print(benimdizi[i]+"     ");
        }*/
        
        
        
    }
}
