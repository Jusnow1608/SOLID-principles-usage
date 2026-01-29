package DashboardKPI.Widgets;

public class CrmWidget implements DashboardWidget {

    @Override
    public void render() {
        double revenue = 15000.0;
        System.out.println("Source: CRM");
        System.out.println("Revenue = " + revenue + " PLN");
    }
}
