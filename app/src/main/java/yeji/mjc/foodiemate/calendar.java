package yeji.mjc.foodiemate;

import android.os.Bundle;
import android.widget.CalendarView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class calendar extends AppCompatActivity {

    private Calendar startDate;
    private Calendar endDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendar);

        CalendarView calendarView = findViewById(R.id.calendarView);

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView calendarView, int year, int month, int dayOfMonth) {
                // 선택한 날짜의 정보를 가져옴
            }
        });

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView calendarView, int year, int month, int dayOfMonth) {
                Calendar selectedDate = Calendar.getInstance();
                selectedDate.set(year, month, dayOfMonth);

                if (startDate == null || endDate != null) {
                    startDate = selectedDate;
                    endDate = null;
                } else if (selectedDate.before(startDate)) {
                    startDate = selectedDate;
                } else {
                    endDate = selectedDate;
                }

                // 선택한 시작일과 종료일을 사용하여 연속된 날짜를 표시하는 기능 등을 구현
            }
        });

    }
}
