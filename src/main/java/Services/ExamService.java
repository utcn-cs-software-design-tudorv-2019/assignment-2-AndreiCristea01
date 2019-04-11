package Services;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import entities.Exam;
import entities.Teacher;
import repositorys.ExamRepository;
@Service()
public class ExamService {
	
	@Inject
	ExamRepository courseRepository;

	public List<Exam> getAllCourses() {
		return courseRepository.findAll();
	}

	public Exam getByCourseid(int id) {
		return courseRepository.findByCourseid(id);
	}

	public Exam getByName(String name) {
		return courseRepository.findByName(name);
	}

	public Exam getByTeacher(Teacher teacher) {
		return courseRepository.findByTeacher(teacher);
	}

	public Exam insert(Exam course) {
		return courseRepository.save(course);
	}

	public void delete(Exam course) {
		courseRepository.delete(course);
	}

	public void deleteByCourseId(int id) {
		courseRepository.deleteByCourseid(id);

	}

	public void update(Exam course) {
		Exam foundCourse = courseRepository.findByCourseid(course.getCourseid());
		foundCourse = course;
		courseRepository.save(foundCourse);
	}

}
