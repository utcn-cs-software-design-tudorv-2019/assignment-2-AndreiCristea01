package Services;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import entities.Student;
import repositorys.StudentRepository;
@Service()
public class StudentService {
	@Inject
	StudentRepository studentRepository;

	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	public Student getStudentById(int id) {
		return studentRepository.findByStudentid(id);
	}

	public Student getStudentByName(String name) {
		return studentRepository.findByName(name);
	}
}
