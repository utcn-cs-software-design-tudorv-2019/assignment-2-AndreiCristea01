package repositorys;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.Exam;
import entities.Teacher;

public interface ExamRepository extends JpaRepository<Exam, Integer>{
	
	public List<Exam> findAll();

	public Exam findByCourseid(int id);

	public Exam findByName(String name);

	public Exam findByTeacher(Teacher teacher);

	public Exam save(Exam course);

	public void delete(Exam course);

	public void deleteByCourseid(int id);

}
