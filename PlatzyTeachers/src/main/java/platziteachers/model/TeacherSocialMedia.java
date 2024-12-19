package platziteachers.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="teacher_social_media")
public class TeacherSocialMedia implements Serializable {
	
	@Id
	@Column(name="id_teacher_social_media")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTeacherSocialMedia;
	
	@Column(name="nickName")
	private String nickName;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "id_teacher")
	private Teacher teacher;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "id_social_media")
	private SocialMedia socialMedia;
	
	
	public TeacherSocialMedia() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public TeacherSocialMedia( String nickName) {
		super();
		this.nickName = nickName;
	}

	

	public Long getIdTeacherSocialMedia() {
		return idTeacherSocialMedia;
	}

	public void setIdTeacherSocialMedia(Long idTeacherSocialMedia) {
		this.idTeacherSocialMedia = idTeacherSocialMedia;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public SocialMedia getSocialMedia() {
		return socialMedia;
	}

	public void setSocialMedia(SocialMedia socialMedia) {
		this.socialMedia = socialMedia;
	}	
	
	
}
