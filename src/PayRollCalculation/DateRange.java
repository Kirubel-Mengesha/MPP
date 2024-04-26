package PayRollCalculation;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public final class DateRange {
    private final Calendar startDate;
    private final Calendar endDate;

    public DateRange(Calendar startDate, Calendar endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }


    public boolean isInRange(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return (calendar.after(startDate) || calendar.equals(startDate)) &&
                (calendar.before(endDate) || calendar.equals(endDate));

    }
    public static int getFirstOfMonth(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        return calendar.get(Calendar.DAY_OF_MONTH);
    }
    public  static  int getLastDayOfMonth(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        return sdf.format(startDate.getTime()) + " - " + sdf.format(endDate.getTime());
    }
}
