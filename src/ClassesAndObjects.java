public class ClassesAndObjects {
    public static void main(String[] args) {
        Person  person1 = new Person();
        //person1.name = "Oleh";
        person1.setNameAndAge("Oleh",20);
        String s1 = "Vova";
        person1.age = 50;
        //person1.speak();
        //System.out.println("My name is "+person1.name+","+"I am"+"."+person1.age+"years old");
        Person person2 = new Person();
        person2.setNameAndAge(s1,30);
        //person2.age = 20;
        //person2.speak();
        person1.calculateYearsToRetirement();
        person2.calculateYearsToRetirement();
        int year1 = person1.calculateYearsToRetirement1();
        int year2 = person2.calculateYearsToRetirement1();
        System.out.println(year1);
        System.out.println(year2);
        person1.speak();
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
    void setNameAndAge(String username, int userage){
        name = username;
        age = userage;

    }
    void  calculateYearsToRetirement(){
        int years = 65-age;
        System.out.println("Retirement"+ years);
    }
    int calculateYearsToRetirement1(){
        int years1 = 65-age;
        return years1;

    }
    void speak(){
        for(int i =0;i<3;i++) {
            System.out.println("My name " + name + "," + "I am" + age + "," + "years old");
        }

    }

}
