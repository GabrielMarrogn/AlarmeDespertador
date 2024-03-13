import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int hora = sc.nextInt();
            int minuto = sc.nextInt();
            int hora2 = sc.nextInt();
            int minuto2 = sc.nextInt();

            if (hora == 0 && minuto == 0 && hora2 == 0 && minuto2 == 0) {
                break;
            }

            LocalTime start = LocalTime.of(hora, minuto);
            LocalTime end = LocalTime.of(hora2, minuto2);

            long diferenca = ChronoUnit.MINUTES.between(start, end);

            if (diferenca < 0) {
                diferenca = diferenca + 1440;
            }

            System.out.println(diferenca);

        }

        sc.close();

    }
}
