import java.util.Locale;
import java.util.Scanner;

public class Calculator {

    Scanner scanner = new Scanner(System.in);
    String productList = "";
    String productName = "";
    float price = 0;
    float sum = 0;

    void addProduct() {

        while (true) {

            System.out.println("Введите название товара или \"Завершить\" для прекрашения ввода товаров");
            productName = scanner.next();

            if (productName.equalsIgnoreCase("завершить")) {
                break;
            }

            System.out.println("Введите стоимость товара");

            while (!scanner.hasNextFloat()) {
                System.out.println("ой, Вы ввели не число, введите число");
                scanner.next();
            }
            price = scanner.nextFloat();

            productList = productList + "Товар: " + productName + " цена: " + price + "\n";
            sum = sum + price;
            System.out.println("Товар: " + productName + " успешно добавлен");

        }


    }



    }

