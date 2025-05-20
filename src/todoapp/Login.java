package todoapp;

public class Login {
    public void performLogin() {
        System.out.print("Enter username: ");
        String user = Main.scanner.nextLine();
        System.out.print("Enter password: ");
        String pass = Main.scanner.nextLine();
        Main.isLoggedIn = true;
        System.out.println("Login successful.");
    }
}
