package com.pluralsight;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//Exercise Creating Unit Tests
class EmployeeTest {
    @Test
    public void punchIn_ClockInTime_Now() {
        Employee employee1 = new Employee(1, "Adrian", "Sales", 17.5);
        double expectedStartTime = 8.5;

        employee1.punchIn(8.5);

        double actualStartTime = 8.5;

        assertEquals(expectedStartTime, actualStartTime);
    }

    @Test
    public void punchOut_ClockOut_TimeAndHoursWorks() {
        Employee employee2 = new Employee(2, "Sally", "Sales", 19);
        employee2.punchIn(8.5);
        double expectedHoursWorked = 8.5;

        employee2.punchOut(17);

        double actualHoursWorked = employee2.getHoursWorked();

        assertEquals(expectedHoursWorked, actualHoursWorked);
    }

}