package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class EmployeeAndCompanyFacadeTestSuite {

    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private Facade facade;

    @Test
    public void TestFindCompanyByPartOfName(){
        //Given
        Company company1 = new Company("Web Wizzards");
        Company company2 = new Company("Smart Squad");
        Company company3 = new Company("Innovative Insights");
        Company company4 = new Company("Pixel Pioneers");
        Company company5 = new Company("Future innovations");
        companyDao.save(company1);
        companyDao.save(company2);
        companyDao.save(company3);
        companyDao.save(company4);
        companyDao.save(company5);

        //When
        List<Company> companies = facade.findCompanyByPartOfName("inno");

        //Then
        try {
            Assertions.assertEquals(2, companies.size());
        } catch (Exception e) {
        } finally {
            //CleanUp
            companyDao.deleteAll();
        }
    }

    @Test
    public void TestFindEmployeeByPartOfName(){
        //Given
        Employee employee1 = new Employee("Samantha", "Hunt");
        Employee employee2 = new Employee("Diana", "Watson");
        Employee employee3 = new Employee("Morris", "Holloway");
        Employee employee4 = new Employee("Michael", "Morgan");
        Employee employee5 = new Employee("Benjamin", "Moran");
        employeeDao.save(employee1);
        employeeDao.save(employee2);
        employeeDao.save(employee3);
        employeeDao.save(employee4);
        employeeDao.save(employee5);

        //When
        List<Employee> employees = facade.findEmployeeByPartOfName("mor");

        //Then
        try {
            Assertions.assertEquals(3, employees.size());
        } catch (Exception e) {
        } finally {
            //CleanUp
            employeeDao.deleteAll();
        }
    }
}
