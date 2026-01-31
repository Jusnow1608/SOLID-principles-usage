package BusinessCalendar.Plugins;

import java.util.List;

public class GoogleCalendarClient implements TaskProvider {
    public List<String> fetchTasks() {
        return List.of("Meeting with accountant (20.10.2025)");
    }
}
