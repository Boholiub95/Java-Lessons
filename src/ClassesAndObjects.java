public class ClassesAndObjects {
    public static void main(String[] args) {
        Person  person1 = new Person();
        person1.name = "Oleh";
        person1.age = 50;
        person1.speak();
        //System.out.println("My name is "+person1.name+","+"I am"+"."+person1.age+"years old");
        Person person2 = new Person();
        person2.name = "Vova";
        person2.age = 20;
        person2.speak();
        ///System.out.println("My name is "+person2.name+","+"I am"+","+person2.age+"years old");

    }
}

class Person{
    // Class can have
    //  1 Date
    // 2 Actions
    String name;
    int age;
    void speak(){
        for(int i =0;i<3;i++) {
            System.out.println("My name " + name + "," + "I am" + age + "," + "years old");
        }

    }

}
