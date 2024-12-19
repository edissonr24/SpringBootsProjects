package platziteachers.service;

import com.platzi.platziteachers.model.Teacher;

import java.util.List;

public interface TeacherService {

	void saveTeacher(Teacher teacher);
	
	List<Teacher> findAllTeachers();
	
	void deleteTeacherById(Long idTeacher);
	
	void updateTeacher(Teacher teacher);
	
	Teacher findById(Long idTeacher);
	
	Teacher findByName(String name);
}
