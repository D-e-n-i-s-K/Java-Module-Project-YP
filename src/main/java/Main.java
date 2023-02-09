import java.util.Scanner;

// dev branch for Y.Practicum
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int personCount;

        System.out.println("На скольких человек необходимо разделить счёт");
        while (!scanner.hasNextInt()) {
            System.out.println("ой, Вы ввели не число, введите число");
            scanner.next();
        }
        personCount = scanner.nextInt();

        Calculator  calculator = new Calculator();
        calculator.addProduct();

        double personSum = calculator.sum / personCount;

        System.out.println("Добавленные товары:\n" + calculator.productList);
        System.out.println(sumResult(personSum) );

    }

    static String sumResult(double personSum) {

        String ending = "";
        int wholePart = (int) personSum;

        if (5 <=  wholePart &&  wholePart <= 20){
            ending =  "рублей";
        } else if ( wholePart == 1) {
            ending =  "рубль";
        } else if ( wholePart == 2 ||  wholePart == 3 || wholePart == 4) {
            ending =  "рубля";
        }
        else {
             ending =  "рублей";
        }

        return String.format("Каждый должен заплатить: %.2f  %s", personSum, ending);

    }

}
