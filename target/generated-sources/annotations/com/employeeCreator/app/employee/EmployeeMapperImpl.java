package com.employeeCreator.app.employee;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-06T08:45:15+1100",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public Employee employeeDtoToEmployee(EmployeeDTO employeeData) {
        if ( employeeData == null ) {
            return null;
        }

        Employee employee = new Employee();

        employee.setFirstName( employeeData.getFirstName() );
        employee.setMiddleName( employeeData.getMiddleName() );
        employee.setLastName( employeeData.getLastName() );
        employee.setMobileNumber( employeeData.getMobileNumber() );
        employee.setEmail( employeeData.getEmail() );
        employee.setAddress( employeeData.getAddress() );
        employee.setStartDate( employeeData.getStartDate() );
        employee.setContractType( employeeData.getContractType() );
        employee.setTimeBase( employeeData.getTimeBase() );
        employee.setWeeklyHours( employeeData.getWeeklyHours() );
        employee.setEndDate( employeeData.getEndDate() );
        employee.setTimeWithCompany( employeeData.getTimeWithCompany() );

        return employee;
    }

    @Override
    public void updateEmployeeFromDto(EmployeeDTO updatedEmployeeData, Employee employee) {
        if ( updatedEmployeeData == null ) {
            return;
        }

        employee.setFirstName( updatedEmployeeData.getFirstName() );
        employee.setMiddleName( updatedEmployeeData.getMiddleName() );
        employee.setLastName( updatedEmployeeData.getLastName() );
        employee.setMobileNumber( updatedEmployeeData.getMobileNumber() );
        employee.setEmail( updatedEmployeeData.getEmail() );
        employee.setAddress( updatedEmployeeData.getAddress() );
        employee.setStartDate( updatedEmployeeData.getStartDate() );
        employee.setEndDate( updatedEmployeeData.getEndDate() );
        employee.setContractType( updatedEmployeeData.getContractType() );
        employee.setTimeBase( updatedEmployeeData.getTimeBase() );
        employee.setWeeklyHours( updatedEmployeeData.getWeeklyHours() );
        employee.setTimeWithCompany( updatedEmployeeData.getTimeWithCompany() );
    }
}
