package com.docsconsole.tutorials.optaional;

import com.docsconsole.tutorials.optaional.util.EmployeeUtils;

public class MainClient {
    public static void main(String[] args) throws Exception {

        EmployeeUtils utils = new EmployeeUtils();
        /*utils.getEmployeeByName("David");
        utils.getEmployee(101);*/

        //utils.getEmployeeByName("");
        utils.getEmployeeById(null);


    }
}
