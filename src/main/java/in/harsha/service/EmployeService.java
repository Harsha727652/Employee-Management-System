package in.harsha.service;

import java.util.List;

import in.harsha.entity.Employe;
	
public interface EmployeService {
List<Employe> getAllEmployees();
void saveEmployee(Employe employe);
Employe getEmployeeId(long id);
void deleteEmployyeById(long id);
}
