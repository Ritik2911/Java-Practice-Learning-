import java.util.*;

public class RestrauntBiling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int billValue = 0;
        char ch = 'y';
        do {
            System.out.println("Enter:-\n\t1 for Indian food:\n\t2 for Italian food:\n\t3 for Chinese:");
            int choice1 = sc.nextInt();
            switch (choice1) {
                case 1 -> {
                    do {
                        System.out.println("Enter:- \n\t1 for af;af\n\t2 for af;a\n\t3 for fajfa");
                        int choice2 = sc.nextInt();
                        switch (choice2) {
                            case 1 -> billValue += 100;
                            case 2 -> billValue += 130;
                            case 3 -> billValue += 150;
                            default-> {
                                System.out.println("Try agian: ");
                                ch='y';
                                continue;
                            }
                        }
                        System.out.println("Enter 'm' to choose more dish\nEnter 'y' to chose again");
                        ch = sc.next().charAt(0);
                    } while (ch == 'm');
                }
                case 2 -> {
                    do {
                        System.out.println("Enter:- \n\t1 for faafe\n\t2 for fasfgha\n\t3 for hrgcd");
                        int choice2 = sc.nextInt();
                        switch (choice2) {
                            case 1 -> billValue += 180;
                            case 2 -> billValue += 200;
                            case 3 -> billValue += 210;
                            default-> {
                                System.out.println("Try agian: ");
                                ch='y';
                                continue;
                            }
                        }
                        System.out.println("Enter 'm' to choose more dish\nEnter 'y' to chose again");
                        ch = sc.next().charAt(0);
                    } while (ch == 'm');
                }
                case 3 -> {
                    do {
                        System.out.println("Enter:- \n\t1 for hrvj\n\t2 for bf\n\t3 for csrtd");
                        int choice2 = sc.nextInt();
                        switch (choice2) {
                            case 1 -> billValue += 210;
                            case 2 -> billValue += 230;
                            case 3 -> billValue += 280;
                            default-> {
                                System.out.println("Try agian: ");
                                ch='y';
                                continue;
                            }
                        }
                        System.out.println("Enter 'm' to choose more dish\nEnter 'y' to chose again");
                        ch = sc.next().charAt(0);
                    } while (ch == 'm');
                }
                default-> {
                    System.out.println("Try agian: ");
                    ch='y';
                }
            }
        } while (ch == 'y');
        System.out.println("The total bill value is: "+billValue);
    }
}
