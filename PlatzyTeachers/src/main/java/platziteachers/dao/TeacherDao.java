package platziteachers.dao;

import com.platzi.platziteachers.model.Teacher;

import java.util.List;


public interface TeacherDao {
	
	void saveTeacher(Teacher teacher);
	
	List<Teacher> findAllTeachers();
	
	void deleteTeacherById(Long idTeacher);
	
	void updateTeacher(Teacher teacher);
	
	Teacher findById(Long idTeacher);
	
	Teacher findByName(String name);

}
