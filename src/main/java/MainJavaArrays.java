import java.util.Arrays;

public class MainJavaArrays {
    public static void main(String[] args) {
        int [] ar = {                     //-- Array list int [] ar = {,,};
                9,2,5,-1,8,3,6,4
        };                              //INT 4 Байта
         System.out.println(ar[2]);
         int a= ar[0] +ar[1];
         System.out.println("a=" +a);
         int[] ar1=ar;
         ar1[0]=10;
        System.out.println(ar1[0]);
        ar= null;
        System.out.println(ar1 [5]);
                               //      0    1   2   3  4    5
        int[] ar2= new int[6]; // ar 2 [0] [0] [0] [0] [0] [0]
        ar2[3]=-2;

        int[] ar3 = new int[1000000000];
        ar3[3] = -2;

        System.out.println(ar3.length);

    }
}
