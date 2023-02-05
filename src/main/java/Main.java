import java.util.Scanner;

// dev branch for Y.Practicum
public class Main {

    public static void main(String[] args) {
        // ваш код начнется здесь
        // вы не должны ограничиваться только классом Main и можете создавать свои классы по необходимости
        Scanner scanner = new Scanner(System.in);
        int personCount;

        while (true){
            System.out.println("На скольких человек необходимо разделить счёт");
            personCount = scanner.nextInt();
            // System.out.println("введено количество " + personCount);
            if (personCount > 1){
                break;
            }else{
                System.out.println("Ошибка, ввести корректное значение");
            }
        }

        Calculator  calculator = new Calculator();
        calculator.addProduct();

        double personSum = calculator.sum / personCount;

        System.out.println("Добавленные товары:\n" + calculator.productList);
        System.out.println(sumResult(personSum) );

    }

    static String sumResult(double personSum) {

        String ending = "";

        if (5 <= personSum%100 && personSum%100 <= 20){
            ending =  "рублей";
        } else if (personSum%10 == 1) {
            ending =  "рубль";
        } else if (personSum%10 == 2 || personSum%10 == 3 || personSum%10 == 4) {
            ending =  "рубля";
        }
        else {
             ending =  "рублей";
        }

        return String.format("Каждый должен заплатить: %.2f  %s", personSum, ending);

    }

}
