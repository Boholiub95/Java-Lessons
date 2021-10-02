public class Lesson19 {
    public static void main(String[] args) {
        Human h1 = new Human("Bob",40);
        Human h2 = new Human("Ton",15);
        Human.description = "Nice";
        Human.description = "Bad";



    }

}
class  Human{


    private String name;
    private int  age;
    public static String description;

     public Human(String name,int age){
         System.out.println("Hello3");
         this.name = name;
         this.age = age;

     }
    public void setName(String name){this.name = name;}
    public  void  setAge(int age){this.age =  age;}

    public static void getAllfields() {
        System.out.println( name+","+age+","+description);

    }
}
