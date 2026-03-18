/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package system;
import adt.*;
import interfaces.CRUDOperations;
import reports.Report;
/**
 *
 * @author Cam
 */
public class ReportManager implements CRUDOperations<Report> {
    private SinglyLinkedList<Report> reportList;
    private ReportQueue reportQueue;
    private ActionStack actionStack;

    public ReportManager(){
        reportList = new SinglyLinkedList<>();
        reportQueue = new ReportQueue();
        actionStack = new ActionStack();
    }

    @Override
    public void create(Report report){
        reportList.add(report);
        actionStack.push("Added report: " + report.getTitle());
    }

    @Override
    public String readAll(){
        return reportList.displayList();
    }

    @Override
    public boolean update(int id, Report newReport){

        for (int i = 0; i < reportList.size(); i++){
            Report r = reportList.get(i);

            if (r.getReportId() == id){
                reportList.remove(i);
                reportList.add(newReport);
                actionStack.push("Updated report ID: " + id);
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean delete(int id){

        for (int i = 0; i < reportList.size(); i++){
            Report r = reportList.get(i);

            if (r.getReportId() == id){
                reportList.remove(i);
                actionStack.push("Deleted report ID: " + id);
                return true;
            }
        }

        return false;
    }

    public void enqueueReport(Report report){
        reportQueue.enqueue(report);
        actionStack.push("Enqueued report: " + report.getTitle());
    }

    public Report processNextReport(){
        Report r = (Report) reportQueue.dequeue();

        if (r != null){
            actionStack.push("Processed report: " + r.getTitle());
        }

        return r;
    }

    public String viewHistory(){
        return actionStack.displayStack();
    }
}
