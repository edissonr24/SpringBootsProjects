package platziteachers.service;

import com.platzi.platziteachers.dao.SocialMediaDao;
import com.platzi.platziteachers.model.SocialMedia;
import com.platzi.platziteachers.model.TeacherSocialMedia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service("socialMediaService")
@Transactional
public class SocialMediaServiceImpl implements SocialMediaService {

	@Autowired
	private SocialMediaDao _socialMediaDao;
	
	@Override
	public void save(SocialMedia socialMedia) {
		// TODO Auto-generated method stub
		_socialMediaDao.save(socialMedia);
	}

	@Override
	public List<SocialMedia> findAllSocialMedias() {
		// TODO Auto-generated method stub
		return _socialMediaDao.findAllSocialMedias();
	}

	@Override
	public void deleteSocialMediaById(Long socialMediaId) {
		// TODO Auto-generated method stub
		_socialMediaDao.deleteSocialMediaById(socialMediaId);
	}

	@Override
	public void updateSocialMedia(SocialMedia socialMedia) {
		// TODO Auto-generated method stub
		_socialMediaDao.updateSocialMedia(socialMedia);
	}

	@Override
	public SocialMedia findById(Long idSocialMedia) {
		// TODO Auto-generated method stub
		return _socialMediaDao.findById(idSocialMedia);
	}

	@Override
	public SocialMedia findByName(String name) {
		// TODO Auto-generated method stub
		return _socialMediaDao.findByName(name);
	}

	@Override
	public TeacherSocialMedia findSocialMediaByIdAndNickName(Long idSocialMedia, String nickName) {
		// TODO Auto-generated method stub
		return null;
	}

}
