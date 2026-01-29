package DashboardKPI;

import DashboardKPI.Widgets.CalendarWidget;
import DashboardKPI.Widgets.CrmWidget;
import DashboardKPI.Widgets.GoogleAdsWidget;
import DashboardKPI.Widgets.IdeaTestWidget;

public class Main {
    public static void main(String[] args) {
        DashboardKPI dashboard = new DashboardKPI();

        dashboard.addWidget(new CrmWidget());
        dashboard.addWidget(new GoogleAdsWidget());
        dashboard.addWidget(new IdeaTestWidget());
        dashboard.addWidget(new CalendarWidget());

        dashboard.displayStatistics();
    }
}
