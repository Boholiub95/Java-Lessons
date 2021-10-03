public class Lesson19 {
    public static void main(String[] args) {
        Human h1 = new Human("Bob",40);
        Human h2 = new Human("Ton",15);
        h1.printNumberOfPeople();
        h2.printNumberOfPeople();
        Human h3 = new Human("BIB",55);
        h1.printNumberOfPeople();
        h2.printNumberOfPeople();
        h3.printNumberOfPeople();
        /*Human.description = "Nice";
        h1.getAllFields();
        h2.getAllFields();
        Human.description = "Bad";
        h1.getAllFields();
        h2.getAllFields();
         */



       /* System.out.println(Math.pow(2,4));
        System.out.println(Math.PI);
        */


    }

}
class  Human{


    private static String name;
    private static int  age;
    private static int  countPeople;

     public Human(String name,int age){
         this.name = name;
         this.age = age;
         countPeople ++;

     }
    public void setName(String name){this.name = name;}
    public  void  setAge(int age){this.age =  age;}

    /*public static void getAllFields() {
        System.out.println(name+","+age+","+description);

    }
    public static void printAllFields(){
        System.out.println(name);
    }

     */
    public void printNumberOfPeople(){
        System.out.println("Number of people is "+countPeople);
    }
}
