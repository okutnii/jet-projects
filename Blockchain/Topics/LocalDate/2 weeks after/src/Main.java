import java.time.LocalDate;
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        LocalDate ld = LocalDate.parse(str);
        
            ld = ld.plusDays(14);


        System.out.println(ld);
    }
}
