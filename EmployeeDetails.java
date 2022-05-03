package week1.day2;

/**
 * @author mukesh
 *
 */
public class EmployeeDetails {
	public void printEmployeeName(String empName, int empId) {
		System.out.println(" empName & empId " + empName +" "+ empId);	
		}
		public void getEmployeeAddress(String empAddress) {
			System.out.println("Employee address: "+ empAddress);	
		}
		public void printEmployeeSalary(double empSalary) {
			System.out.println("Employee salary: "+ empSalary);
		}
		 public void printEmployeeMobileNumber(long mobNumber) {
			 System.out.println("Employee number: "+ mobNumber);	 
		}
		public static void main(String[] args) {

			EmployeeDetails object=new EmployeeDetails();
			
			object.printEmployeeName("mukesh kannan", 7);
		    object.getEmployeeAddress("anna nagar,tirunelveli");
			object.printEmployeeSalary(70000.50);
			object.printEmployeeMobileNumber(80566878);
		}
	}
	
