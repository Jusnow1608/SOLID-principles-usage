package DashboardKPI;

import DashboardKPI.Widgets.DashboardWidget;

import java.util.ArrayList;
import java.util.List;

public class DashboardKPI {

private List<DashboardWidget> widgets = new ArrayList<>();

public void addWidget(DashboardWidget widget){
    widgets.add(widget);
}

    public void displayStatistics() {

        System.out.println("--- KPI DASHBOARD ---");
        for (DashboardWidget widget : widgets){
            System.out.println("");
            widget.render();
    }
        System.out.println("---------------------");
    }
}
