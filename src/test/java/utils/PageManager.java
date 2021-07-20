package utils;

import pages.*;

public class PageManager {


    public static LoginPage loginPage;
    public static DashBoardPage dashBoardPage;
    public static EmployeeListPage employeeListPage;
    public static AdminPage adminPage;
    public static PersonalEmployeeData personalEmployeeData;
    public static SkillsPage skillsPage;
    public static QualificationsSkillsPage qualificationsSkillsPage;
    public static LicensesPage licensesPage;
    public static QualificationsLicensePage qualificationsLicensePage;
    public static QualificationsLanguagesPage qualificationsLanguagesPage;
    public static LanguagesPage languagesPage;
    public static MembershipsPage membershipsPage;
    public static PersonalEmployeeMembershipData persEmpMemData;
    public static PersonalEmployeeContactDetailsData persContEmpData;
    public static AddEmployeeECAndDependentsPage addEmployeeECAndDependentsPage;
    public static AddNewJobTitlePage addNewJobTitlePage;


    public static void initializePageObjects() {
        loginPage = new LoginPage();
        dashBoardPage = new DashBoardPage();
        employeeListPage = new EmployeeListPage();
        adminPage = new AdminPage();
        personalEmployeeData = new PersonalEmployeeData();
        skillsPage = new SkillsPage();
        qualificationsSkillsPage = new QualificationsSkillsPage();
        licensesPage = new LicensesPage();
        qualificationsLicensePage = new QualificationsLicensePage();
        qualificationsLanguagesPage = new QualificationsLanguagesPage();
        languagesPage = new LanguagesPage();
        membershipsPage = new MembershipsPage();
        persEmpMemData = new PersonalEmployeeMembershipData();
        persContEmpData = new PersonalEmployeeContactDetailsData();
        addEmployeeECAndDependentsPage = new AddEmployeeECAndDependentsPage();
        addNewJobTitlePage=new AddNewJobTitlePage();
    }
}
