import java.util.Scanner;
public class Service {

    static int cash = 0;
    static void showTheServices() {

        System.out.print("Здравствуйте, спасибо что воспользовались нашим сервисом,\n" +
                "хотите ознакомиться со списком наших услуг?\n" +
                "(Пожалуйста, в ответ напишите 'да' или 'нет' c заглавной буквы)" + " ");
        System.out.println(" ");

        Scanner scanner = new Scanner(System.in);
        String QuestionAboutTheWork = scanner.nextLine();

        if (QuestionAboutTheWork.equals("Да")) {
            System.out.println(" ");
            System.out.println("Замена масла - 550руб.\n" +
                "замена свечей зажигания - 450руб.\n" +
                "замена цепи ГРМ - 5000руб.\n" +
                "замена ремня ГРМ - 5000руб.\n" +
                "замена воздушного фильтра - 400руб.\n"); }
            else if (QuestionAboutTheWork.equals("Нет")) {
                System.exit(0);}
    }

     static void depositingCash() {

        System.out.println("Каким количеством средств для покупки наших услуг вы располагаете?");
        Scanner scanner = new Scanner(System.in);
        int QuestionAboutTheCash = scanner.nextInt();
        System.out.println(QuestionAboutTheCash);
        cash = QuestionAboutTheCash;

    }

    static void buyAService() {

        Scanner scanner = new Scanner(System.in);
        String nameOfService = scanner.nextLine();

        switch  (nameOfService) {
            case "Замена масла":
                System.out.println("Выбрана замена масла");
                break;

            case "Замена свечей зажигания":
                System.out.println("Выбрана замена свечей зажигания");
                break;

            case "Замена цепи ГРМ":
                System.out.println("Выбрана замена цепи ГРМ");
                break;
            case "Замена ремня ГРМ":
                System.out.println("Выбрана замена ремня ГРМ");
                break;
            case "Замена воздушного фильтра":
                System.out.println("Выбрана замена воздушного фильтра");

//if (cash )
        }
    }
}
