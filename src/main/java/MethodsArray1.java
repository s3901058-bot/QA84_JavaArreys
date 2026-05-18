public class MethodsArray1 {

    /*
Home Work
 */

    public static int arraySum(byte[] ar) {
        int sum=0;
        for (byte num : ar) {
            sum+=num;
        }
        return sum;
    }

    public static double arraySum(double[] ar) {
        double sum=0;
        for(double num:ar){
            sum+=num;
        }
        return sum;

    }
    public static double arraySum(float[] ar) {
        double sum=0;
        for(float num:ar){
            sum=sum+num;
        }
        return sum;
    }

    public static byte arraySum(boolean[] ar) {
        byte sum = 0;
        for (boolean num : ar) {
            if(num==true)
                sum++;
        }
        return sum;
    }
    /*

/*
    public static byte[] arraySum(boolean[] ar) {
       byte[] sum = new byte[ar.length]; //создаем такой же байт массив как и болеан той же длины
       for(int s=0;s<ar.length;s++){     // делаем перебор от индекса 0 до конца массива по шагово S// ++
          if(ar[s]){                     // если ар равен true
              sum[s]=1;                 // тогда пишим 1
          }
          else{                        // иначе будет false
              sum[s]=0;
          }
       }
          return sum;              //
       }


/*


        4.
public static byte arraySum(boolean[] ar)
ar-> {true,false,true,false};
        1    0     1    0
return sum of elements

END Home Work
 */



    public static String arraySum(char[] ar){
            String res="";
            for(char c:ar){
                res+=c;
        }
            return res;
    }



    public static String arraySum(String[] ar){
        String res=" "; //empty string not null  //Склеевания строк не сложения
        for(String s:ar){
          res+=s+ " ";  //res=res+s+" ";
        }
        res+=".";
        return res;


    }


    public static int arraySum(int[] ar) {
        int sum = 0;

        for (int num : ar) {
            sum += num;  // sum = sum + num
        }

        return sum;
    }
}



/*


                      i++
     0  1  2  3  4  5   6   7 ar.length = 7
ar->[9][6][2][1][7][4][-3]
num
     9 6 2 1 7 4 -3
 */
