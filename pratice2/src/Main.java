
import java.util.ArrayList;
import java.util.Scanner;
public class Main extends option {

    Scanner s = new Scanner(System.in);

    ArrayList<Contact> listContact = new ArrayList();
    LogicOption logicOption = new LogicOption();

    public static void main(String[] args) {
        Main m = new Main();
        m.start();
    }

    public void start() {
        while (true) {
            System.out.println("1. Add new contact");
            System.out.println("2. Find a contact by name");
            System.out.println("3. Display contacts");
            System.out.println("4. Exit");
            try {

                int num = Integer.parseInt(s.nextLine());
                if (num == 0 || num == 1 || num == 2 || num == 3 || num == 4) {

                    switch (num) {

                        case 1:
                            System.out.println("#Chose 1");
                            addContact(listContact);
                            break;
                        case 2:
                            System.out.println("#Chose 2");
                            findTell(listContact);
                            break;
                        case 3:
                            System.out.println("#Chose 3");
                            display(listContact);
                            break;
                        case 4:
                            System.out.println("Good Bye! Stop Application");
                            System.exit(0);
                            break;
                        default:
                            break;

                    }
                } else {
                    System.out.println("Ban da chon sai vui long chon lai");
                }
            } catch (Exception e) {
                System.out.println("Vui long chon lai");
            }

        }
    }
}

