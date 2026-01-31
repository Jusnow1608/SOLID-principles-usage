package BusinessCalendar;

import BusinessCalendar.Plugins.*;

import java.util.List;

public class CalendarManager {
    private List<TaskProvider> taskProviders;
    private NotificationDispatcher notificationDispatcher;


    public CalendarManager(List<TaskProvider> taskProviders, NotificationDispatcher notificationDispatcher) {
        this.taskProviders = taskProviders;
        this.notificationDispatcher = notificationDispatcher;
    }

    public void processDailyCalendar(String contactInfo) {
        for (TaskProvider taskProvider : taskProviders) {
            List<String> tasks = taskProvider.fetchTasks();
            for (String task : tasks) {
                System.out.println("Taken from source: " + task);
                notificationDispatcher.dispatch("Task reminder: " + task, contactInfo);
                System.out.println("---------------------------");
            }
        }
    }
}
