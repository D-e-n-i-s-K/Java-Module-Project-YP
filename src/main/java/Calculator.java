import java.util.Locale;
import java.util.Scanner;

public class Calculator {

    Scanner scanner = new Scanner(System.in);
    String productList = "";
    String productName = "";
    float price = 0;
    float sum = 0;

    void addProduct() {

        boolean proceed = true;

        while (proceed) {
            System.out.println("Введите название товара, для завершения ввода товаров введите \"Завершить\"");
            productName = scanner.next();

            System.out.println("Введите стоимость товара");
            price = scanner.nextFloat();

            productList = productList + productName + " цена: " + price + "\n";
            sum = sum + price;
            System.out.println("Товар: " + productName + " успешно добавлен");

            System.out.println("Ввести еще товар?");
            String answer = scanner.next();

            if (answer.toLowerCase().equals("завершить")) {
                proceed = false;
            }
        }


    }



    }

