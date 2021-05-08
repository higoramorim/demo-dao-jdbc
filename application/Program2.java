package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;


public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== Test #1: findById ===");
		Department dep = departmentDao.findById(1);
		System.out.println(dep);
		
		System.out.println("=== Test #2: findAll ===");
		List<Department> list = departmentDao.findAll();
		for (Department d : list) {
			System.out.println(d);
		}
		
		System.out.println("=== Test #3: insert ===");
		Department newDepartment = new Department(null, "P&D");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! new id: " + newDepartment.getId());
		
		System.out.println("=== Test #4: update ===");
		Department dep2 = departmentDao.findById(1);
		dep2.setName("Food");
		departmentDao.update(dep2);
		System.out.println("Updated!!");
		
		System.out.println("=== Test #5: delete ===");
		System.out.print("enter id for delete themself: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Deleted");
		
		sc.close();
	}
}
