/**
 * 
 */
package com.system.ad.solid.srp.solution;

/**
 * 
 */
public class PayrollReportGenerator {

	private Employee employee;

	/**
	 * @param employee
	 */
//	public payrollReportGenerator(Employee employee) {
//
//		this.employee = employee;
//	}

	public void generatePayrollReport(Employee employee) {
		System.out.println("Generating payroll report...!");
		System.out.println("Employee Name: " + employee.getName());
		System.out.println("Salary : " + employee.calculateSalary());

	}
}
