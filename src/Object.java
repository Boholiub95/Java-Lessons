public class Object {
    public static void main(String[] args) {
        Human h3 = new Human3("Oleh",40);
        h3.toString();
        System.out.println(h3);
    }
}
class Human3 {
    private String name;
    private  int age;

    public Human3(String name, int age){
        this.name = name;
        this.age = age;
    }
    public  String toString(){
        return  name+","+age;
    }
}