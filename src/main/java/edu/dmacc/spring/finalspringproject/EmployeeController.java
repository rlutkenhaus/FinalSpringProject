package edu.dmacc.spring.finalspringproject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	@Autowired EmployeeDao dao;

	@RequestMapping(value="/form")
		public ModelAndView employee(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("employeeForm");
		modelAndView.addObject("employee", new Employee());
		return modelAndView;
	}
	
	@RequestMapping(value="/result")
		public ModelAndView processEmployee(Employee employee){
		ModelAndView modelAndView = new ModelAndView();
		dao.insertEmployee(employee);
		modelAndView.setViewName("employeeResult");
		modelAndView.addObject("e", employee);
		return modelAndView;
	}
	
	@Bean
		public EmployeeDao EmployeeDao(){
			EmployeeDao bean = new EmployeeDao();
			return bean;
	}
	
	@RequestMapping(value="/viewAll")
		public ModelAndView viewAll(){
			ModelAndView modelAndView = new ModelAndView();
			List<Employee> allEmployees = dao.getAllEmployees();
			modelAndView.setViewName("viewAllEmployees");
			modelAndView.addObject("all", allEmployees);
			return modelAndView;
	}
}
