package platziteachers.service;

import com.platzi.platziteachers.dao.CourseDao;
import com.platzi.platziteachers.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service("courseService")
@Transactional
public class CourseServiceImpl implements CourseService {

	
	@Autowired
	private CourseDao _courseDao;
	
	@Override
	public void save(Course course) {
		// TODO Auto-generated method stub
		_courseDao.save(course);
	}

	@Override
	public List<Course> findAllCourses() {
		// TODO Auto-generated method stub
		return _courseDao.findAllCourses();
	}

	@Override
	public void deleteCourseById(Long courseId) {
		// TODO Auto-generated method stub
		_courseDao.deleteCourseById(courseId);
	}

	@Override
	public void updateCourse(Course course) {
		// TODO Auto-generated method stub
		_courseDao.updateCourse(course);
	}

	@Override
	public Course findById(Long idCourse) {
		// TODO Auto-generated method stub
		return _courseDao.findById(idCourse);
	}

	@Override
	public Course findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course> findByIdTeacher(Long idTeacher) {
		// TODO Auto-generated method stub
		return null;
	}

}
