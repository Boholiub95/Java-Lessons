public class Lesson19 {
    public static void main(String[] args) {
       Human human1 = new Human();


    }

}
class  Human{


    private String name;
    private int  age;


    public Human(){
     this.name = "Name";
     this.age = 0;
    }
    public  Human(String name){
       this.name = name;
     }
     public Human(String name,int age){
         System.out.println("Hello3");
         this.name = name;
         this.age = age;

     }
    public void setName(String name){this.name = name;}
    public  void  setAge(int age){this.age =  age;}
}
