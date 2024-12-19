package platziteachers.dao;

import com.platzi.platziteachers.model.Course;

import java.util.List;

public interface CourseDao {
	
	void save(Course course);
	
	List<Course> findAllCourses();
	
	void deleteCourseById(Long courseId);
	
	void updateCourse(Course course);	
	
	Course findById(Long idCourse);
	
	Course findByName(String name);
	
	List<Course> findByIdTeacher(Long idTeacher);

}
