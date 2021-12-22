// You can experiment here, it won’t be checked

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.Scanner;

public class Task {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String str1 = sc.nextLine();

    LocalDateTime ld1 = LocalDateTime.parse(str1).plusHours(11);

    List<int[]> l;

    System.out.println(ld1.toLocalDate());
  }
}
