/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package system;
import reports.BikeIssueReport;
import reports.PedestrianIssueReport;
import reports.PublicTransportIssueReport;
import reports.Report;
/**
 *
 * @author Cam
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ReportManager manager = new ReportManager();

        Report report1 = new BikeIssueReport(
                1,
                "Broken Bike Station",
                "Grand Canal Dock",
                "Bike Issue",
                "High",
                "Open",
                "Bike stand is damaged and unusable."
        );

        Report report2 = new PedestrianIssueReport(
                2,
                "Blocked Footpath",
                "Sir John Rogerson's Quay",
                "Pedestrian Issue",
                "Medium",
                "Open",
                "Bins are blocking access on the footpath."
        );

        Report report3 = new PublicTransportIssueReport(
                3,
                "Bus Stop Accessibility Problem",
                "Spencer Dock",
                "Public Transport Issue",
                "High",
                "Open",
                "Wheelchair ramp area is obstructed."
        );

        manager.create(report1);
        manager.create(report2);
        manager.create(report3);

        System.out.println("=== ALL REPORTS ===");
        System.out.println(manager.readAll());

        manager.enqueueReport(report1);
        manager.enqueueReport(report2);

        System.out.println("=== PROCESSED REPORT ===");
        Report processed = manager.processNextReport();
        if (processed != null) {
            System.out.println(processed.displaySummary());
        }

        System.out.println("=== ACTION HISTORY ===");
        System.out.println(manager.viewHistory());
    }
    
}
