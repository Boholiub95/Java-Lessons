public class Arrays {
    public static void main(String[] args) {
        int number = 10; // [10]  //primitive data type
       /// char character = 'a';  //primitive data type
       /// String s = "Hello";
       //String s1 = new String("Hello");
        int[] numbers = new int[5];  // number ->[Array]  reference data type
        //System.out.println(numbers[0]); // 0 1 2 3 4
       for ( int i =0; i<numbers.length; i++){
           numbers[i] =i*10;

       }
       for(int i = 0; i<numbers.length;i++){
           System.out.println(numbers[i]);
       }
        System.out.println();
       int[] numbers1 ={1,2,3};
        for(int i = 0; i<numbers1.length;i++){
            System.out.println(numbers1[i]);}

    }
}
