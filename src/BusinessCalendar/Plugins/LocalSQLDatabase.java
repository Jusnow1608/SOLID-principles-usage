package BusinessCalendar.Plugins;

import java.util.List;

public class LocalSQLDatabase implements TaskProvider {
    public List<String> fetchTasks() {
        return List.of("Request CEIDG (State: Incomplete)");
    }
}
