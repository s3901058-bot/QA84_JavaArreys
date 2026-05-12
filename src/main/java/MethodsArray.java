public class MethodsArray {

    public static void printArray(String[] ar){
        for(String num:ar){

            System.out.print(num +" ");
        }
        System.out.println();

    }


    public static void printArray(boolean[] ar){
        for(boolean num:ar){

            System.out.print(num +" ");
        }
        System.out.println();

    }

    public static void printArray(char[] ar){
        for(char num:ar){

            System.out.print(num +" ");
        }

        System.out.println();

    }


    public static void printArray(float[] ar){
        for(float num:ar){

            System.out.print(num +" ");
        }
        System.out.println();

    }


    public static void printArray(double[] ar){
        for(double num:ar){

            System.out.print(num +" ");
        }
        System.out.println();

    }

    public static void printArray(byte[] ar){
        for(byte num:ar){

            System.out.print(num +" ");
        }
        System.out.println();

    }

     public static void printArray(int[] ar){
         for(int i=0;i<ar.length;i++){  //I++
             System.out.print(ar[i] + " ");
         }
             System.out.println();

     }
}
/*                         i++
     0  1  2  3  4  5   6   7 ar.length = 7
ar->[9][6][2][1][7][4][-3]

     9 6 2 1 7 4 -3
 */
