public class Task8 {
    public static void main(String[] args) {

    }
    public void foo (boolean a, boolean b) {
        if (a) {
            System.out.println("a");
        }else if (a && b ) {
            System.out.println("a && b");
        } else {
            if (!b){
                System.out.println("!b");
            }else {
                System.out.println("else");
            }
        }
    }
}
