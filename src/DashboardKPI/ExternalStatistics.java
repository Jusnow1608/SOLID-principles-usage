package DashboardKPI;

public class ExternalStatistics {

    public void displayExternalStatistics(ExternalSource externalSource) {
        System.out.println("\nEXTERNAL BUSINESS METRICS");

        switch (externalSource) {
            case ExternalSource.CRM:
                double revenue = 15000.0;
                System.out.println("Source: CRM");
                System.out.println("Revenue = " + revenue + " PLN");
                break;
            case ExternalSource.GOOGLEADS:
                double clicks = 1250.0;
                double spend = 300.0;
                System.out.println("Source: Google Ads");
                System.out.println("Clicks = " + clicks + ", Spend = " + spend + " PLN");
                break;
            case ExternalSource.GOOGLEANALYTICS:
                int sessions = 5000;
                System.out.println("Source: Google Analytics");
                System.out.println("Sessions = " + sessions);
                break;
            default:
                System.out.println("Status: No external data connection.");
                break;
        }
    }
}


