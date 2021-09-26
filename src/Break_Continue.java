public class Break_Continue {
    public static void main(String[] args) {
        //Break
       // int i=0;
        //while(true){
         //   if(i==15){
          //      break;
          //  }
          //  System.out.println(i);
          //  i++;
        //Continue
        for (int i=0; i<=15; i++){
            if (i%2==0){
                continue;
            }
            System.out.println("Eто нечетноe число "+i);
        }

        //System.out.println("Ми вишли из цикла");
}}

