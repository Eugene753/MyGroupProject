package steps;

import io.cucumber.java.en.Then;
import utils.DbUtils;
import utils.GlobalVariable;

import java.util.List;
import java.util.Map;

public class DbSteps {

    @Then("enter query into HRMS database")
    public void enter_query_into_hrms_database() {
        String query="select job_title,job_description,note from ohrm_job_title where job_title = '"+ GlobalVariable.newJobTitle+"'";
        List<Map<String,String>> newJobTable= DbUtils.getTableDataAsList(query);
        GlobalVariable.dbNewJobTitle=newJobTable.get(0).get("job_title");
        GlobalVariable.dbNewJobDescription=newJobTable.get(0).get("job_description");
        GlobalVariable.dbNewJobNote=newJobTable.get(0).get("note");
    }
}
