package in.vamsoft.sample;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class CountMonth {

  public static void main(String[] args) {
    
    LocalDate startDate = LocalDate.parse("11-10-2016",DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    LocalDate endDate = LocalDate.now();

    long monthsInYear2 = ChronoUnit.MONTHS.between(startDate, endDate);

    System.out.println(monthsInYear2);
    
  }
  
  
}
