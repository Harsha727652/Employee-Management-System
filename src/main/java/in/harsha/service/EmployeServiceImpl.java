package in.harsha.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.harsha.entity.Employe;
import in.harsha.repo.EmployeRepositiry;
@Service
public class EmployeServiceImpl implements EmployeService
{
	@Autowired
	private EmployeRepositiry employeRepositiry;
	
	@Override
	public List<Employe> getAllEmployees() {
		return employeRepositiry.findAll();
	}

	@Override
	public void saveEmployee(Employe employe) {
		this.employeRepositiry.save(employe);
	}

	@Override
	public Employe getEmployeeId(long id) {
		Optional<Employe> optional = employeRepositiry.findById(id);
		Employe employe=null;
		if(optional.isPresent())
		{
			employe=optional.get();
		}
		else
		{
			throw new RuntimeException("employe not found with id"+id);
		}
		return employe;
	}

	@Override
	public void deleteEmployyeById(long id) {
		this.employeRepositiry.deleteById(id);
		
	}

}
