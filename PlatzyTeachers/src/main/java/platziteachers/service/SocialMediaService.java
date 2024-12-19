package platziteachers.service;

import com.platzi.platziteachers.model.SocialMedia;
import com.platzi.platziteachers.model.TeacherSocialMedia;

import java.util.List;

public interface SocialMediaService {
	
	void save(SocialMedia socialMedia);
	
	List<SocialMedia> findAllSocialMedias();
	
	void deleteSocialMediaById(Long socialMediaId);
	
	void updateSocialMedia(SocialMedia socialMedia);	
	
	SocialMedia findById(Long idSocialMedia);
	
	SocialMedia findByName(String name);
	
	TeacherSocialMedia findSocialMediaByIdAndNickName(Long idSocialMedia, String nickName);
}
