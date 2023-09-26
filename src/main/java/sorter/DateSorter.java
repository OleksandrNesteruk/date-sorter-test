package sorter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class DateSorter {
    public Collection<LocalDate> sortDates(List<LocalDate> unsortedDates) {
        List<LocalDate> datesMonthWithR = new ArrayList<>();
        List<LocalDate> datesMonthWithoutR = new ArrayList<>();
        for (LocalDate date: unsortedDates) {
            if (date.getMonth().name().contains("R")) {
                datesMonthWithR.add(date);
            } else {
                datesMonthWithoutR.add(date);
            }
        }
        datesMonthWithR.sort(Comparator.naturalOrder());
        datesMonthWithoutR.sort(Comparator.reverseOrder());
        datesMonthWithR.addAll(datesMonthWithoutR);
        return datesMonthWithR;
    }
}
