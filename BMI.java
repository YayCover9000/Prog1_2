import java.util.Scanner;
public class BMI {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
//        int KG = sc.nextInt();
//        float KGROE = sc.nextFloat();
        int KG = 75;
        float KGROE = 1.8f;
        float KS;
        float res;
        System.out.println("1. " + KGROE);
        
        //KoerperGroesse zum Quadrat
        KS = (float)Math.sqrt(KGROE);
        System.out.println("3. " + KS);
        
  
        //Berechnung
        //res = KG/(KGROE*KGROE);
        res = KG/KS;
   
//        KGROE = Math.round(KGROE);
//        System.out.println("2. " + KGROE);
    
        
        
        
        //res = KG/KGROE;
        
        float a = 1.8f;
        float b = 2.5f;
        float c = a*a;
        c = c*100;
        //System.out.println(c);
        c = Math.round(c);
        c = c/100;
        int CA = (int)c;
        System.out.println("CA"+CA);
        int CB = (int)((c*100)%100);
        System.out.println("CB"+CB);
        double d = Math.sqrt(a);
        float e = (float)Math.sqrt(a);
        System.out.println("TEST: "+a+"\t"+b+"\t"+c+" \t"+d+"\t"+e);
        System.out.println(CA+","+CB);
        
        
        
        System.out.println("Koerpergewicht: "+KG+" kg\nKoerpergroesse: "+KGROE+" m\nDer BMI betraegt: "+res);
    }
}
