package Gun27_02_Ornek;

public class MyMath {
    public static int getMin(int a, int b ){
        return  Math.min(a,b);

        }
        public static int getMax (int a , int b){
        return Math.max(a,b);// returnun yanindaki tipi neyse o olacak void yerine
        }
        public static int getrandom(int max){
        return (int)(Math.random()*max);

        }
        public static double getussunual(int a, int b){
        return  Math.pow(a,b);
        }
        public static double getkarekok (int a){
        return Math.sqrt(a);
        }
    }

