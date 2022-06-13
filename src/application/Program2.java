package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: Department findById ===");
		Department dep = departmentDao.findById(1);	
		System.out.println(dep);
		
		System.out.println("\n=== TEST 2: Department findByAll ===");
		List<Department> list  =  departmentDao.findAll();
		for (Department department : list) {
			System.out.println(department);
		}
		
		System.out.println("\n=== TEST 3: Department insert===");
		/*Department newDep = new Department(null, "Delivery");
		departmentDao.insert(newDep);
		System.out.println("Inserted new Id= " + newDep.getId());
		*/
		
		System.out.println("\n=== TEST 4: department update===");
		dep = departmentDao.findById(6);
		dep.setName("Cavalaria");
		departmentDao.update(dep);
		
		System.out.println("\n=== TEST 6: department delete===");
		System.out.println("Enter id for delete test: ");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed");
		sc.close();
		
		
		
		
		
		

	}

}
