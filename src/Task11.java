public class Task11 {
    public static void main(String[] args) {
        final char a = 'A', d = 'D';
        char grade = 'B';
        switch (grade) {
            case a:
            case 'B': System.out.println("great");
            case 'C': System.out.println("good"); break;
            case d:
            case 'F': System.out.println("Not good");

        }
    }
}
