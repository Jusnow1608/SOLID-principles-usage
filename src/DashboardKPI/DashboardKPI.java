package DashboardKPI;

public class DashboardKPI {

private ExternalStatistics externalStatistics = new ExternalStatistics();
private InternalStatistics internalStatistics = new InternalStatistics();

    public void displayStatistics(ExternalSource externalSource, InternalModule internalModule) {

        System.out.println("--- KPI DASHBOARD ---");
        externalStatistics.displayExternalStatistics(externalSource);
        internalStatistics.displayInternalStatistics(internalModule);
        System.out.println("---------------------");
    }
}
