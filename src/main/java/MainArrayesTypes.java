public class MainArrayesTypes {
    public static void main(String[] args) {
        int [] ari = {9,2,5,-3,7}; // integer
        double[] ard ={8.2,7.23,9.12,-23.3,-2.1};
        char[] arc={'h','e','l','l','o'};
        byte[] arb={3,127,5,-15,8};
        boolean[] arbool={true,false,true,false};
        String[] arstr={"Hello","Course","QA"};
        float[] arf={6.2f,5.7f,};

        MethodsArray.printArray(ari);
        MethodsArray.printArray(ard);
        MethodsArray.printArray(arc);
        MethodsArray.printArray(arb);
        MethodsArray.printArray(arbool);
        MethodsArray.printArray(arstr);
        MethodsArray.printArray(arf);

        System.out.println(MethodsArray1.arraySum(ari));
        System.out.println(MethodsArray1.arraySum(arc));



        System.out.println(MethodsArray1.arraySum(arb));
        System.out.println(MethodsArray1.arraySum(arbool));

     }
}
