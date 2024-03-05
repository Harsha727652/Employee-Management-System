package in.harsha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import in.harsha.entity.Employe;
import in.harsha.service.EmployeService;

@Controller
public class EmployeeController {
@Autowired
private EmployeService employeService;
@GetMapping("/")
public String homePage(Model model)
{
	model.addAttribute("employeeList", employeService.getAllEmployees());
	return "index";
}
@GetMapping("/newemployeeform")
public String newEmployeeForm(Model model)
{
Employe employe = new Employe();
model.addAttribute("employee", employe);
return "new_employee";
}
@PostMapping("/saveEmployee")
public String saveEmploye(@ModelAttribute("employee") Employe employee)
{
	employeService.saveEmployee(employee);
	return "redirect:/";
}
@GetMapping("/showFormForUpdate/{id}")
public String showFormForUpdate(@PathVariable (value = "id") long id,Model model)
{
	Employe employeeId = employeService.getEmployeeId(id);
	model.addAttribute("employee", employeeId);
	return "update_employee";
}
@GetMapping("/showFormForDelete/{id}")
public String deleteEmployee(@PathVariable(value = "id") long id)
{
	employeService.deleteEmployyeById(id);
	return"redirect:/";
}
}