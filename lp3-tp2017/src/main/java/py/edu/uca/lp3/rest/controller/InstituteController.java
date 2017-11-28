package py.edu.uca.lp3.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import py.edu.uca.lp3.domain.Institute;
import py.edu.uca.lp3.service.InstituteService;

@RestController
@RequestMapping("/institute")
public class InstituteController {

	@Autowired
	private InstituteService instituteService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Institute greetings(@PathVariable("id") Long id) {
        Institute institute = instituteService.findById(id);
        return institute;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Institute> list() {
        return instituteService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody Institute institute) {
    	instituteService.save(institute);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Long id) {
    	instituteService.delete(id);
    }

}