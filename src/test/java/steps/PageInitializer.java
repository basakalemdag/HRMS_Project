package steps;

import pages.*;

public class PageInitializer {
    public static LoginPage login;
    public static DashboardPage dashboard;
    public static AddEmployeePage addEmployee;
    public static EmployeeListPage employeeList;
    public static DirectoryPage directory;
    public static EmployeesDetailsPage personalDetails;
    public static AdminPage adminPage;
    public static AddMembershipPage addMembership;
    public static AddLanguagePage addLanguage;
    public static AddLicensesPage licensesPage;
    public static EmployeeContactDetailsPage employeeContactDetails;
    public static CurrentJobPage currentJob;
    public static AddEmployeeDependantsPage employeeDependacies;
    public static WorkExperiencePage experienceDetails;

    public static void intializePageObjects(){
        login = new LoginPage();
        dashboard = new DashboardPage();
        addEmployee = new AddEmployeePage();
        employeeList = new EmployeeListPage();
        directory = new DirectoryPage();
        personalDetails = new EmployeesDetailsPage();
        licensesPage = new AddLicensesPage();
        adminPage = new AdminPage();
        employeeContactDetails=new EmployeeContactDetailsPage();
        currentJob = new CurrentJobPage();
        experienceDetails = new WorkExperiencePage();
        addMembership = new AddMembershipPage();
        employeeDependacies =new AddEmployeeDependantsPage();
        addLanguage = new AddLanguagePage();


    }
}
