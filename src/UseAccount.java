import static java.lang.System.out;
 class UseAccount {
    public static void main(String[] args) {
        Account myAccount;
        Account yourAccount;
        myAccount = new Account ();
        yourAccount = new Account();

        myAccount.name = "Bob";
        myAccount.address = "222 Inner Lane";
        myAccount.balance = 24.02;
        yourAccount.name = "John";
        yourAccount.address = "121 Outer Street";
        yourAccount.balance = 55.63;


        out.println(myAccount.name);
        out.println("");
        out.println(myAccount.address);
        out.println();
        out.println(myAccount.balance);
        out.println();
        out.println(yourAccount.name);
        out.println("");
        out.println(yourAccount.address);
        out.println();
        out.println(yourAccount.balance);
        out.println();



    }
}
