package ru.coutvv.vkhny.data.entity;

import com.google.gson.annotations.SerializedName;

public class Account {
	@SerializedName("id")
	private Long id;
	@SerializedName("first_name")
	private String firstName;
	@SerializedName("last_name")
	private String lastName;
	@SerializedName("sex")
	private int sex;
	@SerializedName("nickname")
	private String nickname;
	@SerializedName("domain")
	private String domain;
	@SerializedName("bdate")
	private String bdate;
	@SerializedName("photo")
	private String photo;
	@SerializedName("photo_medium")
	private String photoMedium;
	@SerializedName("photo_big")
	private String photoBig;
	@SerializedName("has_mobile")
	private Integer hasMobile;
	@SerializedName("mobile_phone")
	private String mobilePhone;
	@SerializedName("home_phone")
	private String homePhone;
	@SerializedName("university")
	private Integer university;
	@SerializedName("university_name")
	private String universityName;
	@SerializedName("faculty")
	private Integer faculty;
	@SerializedName("faculty_name")
	private String facultyName;
	@SerializedName("graduation")
	private Integer graduation;
	@SerializedName("online")
	private Integer online;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getBdate() {
		return bdate;
	}
	public void setBdate(String bdate) {
		this.bdate = bdate;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getPhotoMedium() {
		return photoMedium;
	}
	public void setPhotoMedium(String photoMedium) {
		this.photoMedium = photoMedium;
	}
	public String getPhotoBig() {
		return photoBig;
	}
	public void setPhotoBig(String photoBig) {
		this.photoBig = photoBig;
	}
	public Integer getHasMobile() {
		return hasMobile;
	}
	public void setHasMobile(Integer hasMobile) {
		this.hasMobile = hasMobile;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public String getHomePhone() {
		return homePhone;
	}
	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}
	public Integer getUniversity() {
		return university;
	}
	public void setUniversity(Integer university) {
		this.university = university;
	}
	public String getUniversityName() {
		return universityName;
	}
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	public Integer getFaculty() {
		return faculty;
	}
	public void setFaculty(Integer faculty) {
		this.faculty = faculty;
	}
	public String getFacultyName() {
		return facultyName;
	}
	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}
	public Integer getGraduation() {
		return graduation;
	}
	public void setGraduation(Integer graduation) {
		this.graduation = graduation;
	}
	public Integer getOnline() {
		return online;
	}
	public void setOnline(Integer online) {
		this.online = online;
	}

	@Override
	public String toString() {
		return firstName + " " + lastName + " id=" + id;
	}
}
