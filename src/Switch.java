import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Введи возраст");
        int age = scanner.nextInt();
        switch (age){
            case 0:
                System.out.println("Ти родислся");
                break;
            case 7:
                System.out.println("You go to school");
            case  18:
                System.out.println("You finish school");
            default:
                System.out.println("None of the conditions are met");

        }
    }
}
