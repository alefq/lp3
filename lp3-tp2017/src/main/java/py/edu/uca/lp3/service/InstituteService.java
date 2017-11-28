package py.edu.uca.lp3.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import py.edu.uca.lp3.domain.Institute;
import py.edu.uca.lp3.repository.InstituteRepository;

@Service
public class InstituteService {

	@Autowired
	private InstituteRepository instituteRepository;
	
	public Institute findById(Long id) {
		Institute institute = instituteRepository.findOne(id);
		return institute;
	}

	public List<Institute> findAll() {
		List<Institute> institutes = new ArrayList<>();
		Iterator<Institute> iteratorInstitutes = instituteRepository.findAll().iterator();
		while(iteratorInstitutes.hasNext()) {
			institutes.add(iteratorInstitutes.next());
		}
		return institutes;
	}

	public void save(Institute institute) {
		instituteRepository.save(institute);
	}

	public void delete(Long id) {
		instituteRepository.delete(id);
	}

}
