package com.kodilla.hibernate.namedQuery;


import com.kodilla.hibernate.nemedQuery.Company;
import com.kodilla.hibernate.nemedQuery.Employee;
import com.kodilla.hibernate.nemedQuery.dao.CompanyDao;
import com.kodilla.hibernate.nemedQuery.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    CompanyDao companyDao;


    @Test
    public void testNamedQuery(){
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        companyDao.save(softwareMachine);
        //int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        //int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        //int greyMatterId = greyMatter.getId();

        //When

        List<Company> compeniesFirstThreeLetters = companyDao.retrieveCompanyName("Dat");
        List<Employee> employeesWithLastname = employeeDao.retrieveEmployeesLastname("Kovalsky");

        //Than
        int companiesFirstThreeLettersSize = compeniesFirstThreeLetters.size();
        int employeesWithLastnameSize = employeesWithLastname.size();

        Assert.assertEquals(1,companiesFirstThreeLettersSize);
        Assert.assertEquals(1,employeesWithLastnameSize);


        //CleanUp
        try {
            companyDao.deleteAll();
        } catch (Exception e){
            // do nothing
        }
    }
}
