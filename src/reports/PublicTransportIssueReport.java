/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reports;

/**
 *
 * @author Cam
 */
public class PublicTransportIssueReport extends Report {
    public PublicTransportIssueReport(int reportId, String title, String location, String issueType,String priority, String status, String description){
        super(reportId, title, location, issueType, priority, status, description);
    }

    @Override
    public String displaySummary(){
        return "[Public Transport Issue] " + super.displaySummary();
    }
}
