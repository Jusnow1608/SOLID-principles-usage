package DashboardKPI;

import javax.xml.transform.Source;

public class Main {
    public static void main(String[] args) {
        DashboardKPI dashboard = new DashboardKPI();

        dashboard.displayStatistics(ExternalSource.CRM, InternalModule.IDEATEST);
        System.out.println();

        dashboard.displayStatistics(ExternalSource.GOOGLEADS, InternalModule.BUSINESSCALENDAR);
        System.out.println();

        dashboard.displayStatistics(ExternalSource.GOOGLEANALYTICS, InternalModule.AIASISTANT);
    }
}
