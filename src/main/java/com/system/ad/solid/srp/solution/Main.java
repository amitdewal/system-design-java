/**
 * 
 */
package com.system.ad.solid.srp.solution;

/**
 * 
 */
public class Main {
	public static void main(String[] args) {
		Employee emp = new Employee("Sachin", 5000);
		emp.calculateSalary();

		PayrollReportGenerator payrollReportGenerator = new PayrollReportGenerator();
		payrollReportGenerator.generatePayrollReport(emp);
	}
}
