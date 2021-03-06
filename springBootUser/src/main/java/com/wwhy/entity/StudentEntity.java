package com.wwhy.entity;

import com.wwhy.common.entity.BasicEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
* @author wangpan
* create date:2019-09-05
*/
@ApiModel(value="")
public class StudentEntity extends BasicEntity {

	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "id",name="id")
	private Long id;

	@ApiModelProperty(value = "姓名",name="name")
	private String name;

	@ApiModelProperty(value = "姓名2",name="name2")
	private String name2;

	@ApiModelProperty(value = "密码MD5加密",name="password")
	private String password;

	@ApiModelProperty(value = "学号",name="code")
	private String code;

	@ApiModelProperty(value = "出生日期",name="birthday")
	private String birthday;

	@ApiModelProperty(value = "性别（1：男；2：女）",name="sex")
	private Byte sex;

	@ApiModelProperty(value = "民族",name="nation")
	private String nation;

	@ApiModelProperty(value = "学院",name="college")
	private String college;

	@ApiModelProperty(value = "专业",name="major")
	private String major;

	@ApiModelProperty(value = "国籍",name="nationality")
	private String nationality;

	@ApiModelProperty(value = "入学年份",name="entranceDate")
	private String entranceDate;

	@ApiModelProperty(value = "学生类型（1：专科；2：本科；3：研究生；4：留学生；5：交换生；6：国防生）",name="studentType")
	private Byte studentType;

	@ApiModelProperty(value = "身份证",name="identity")
	private String identity;

	@ApiModelProperty(value = "电话",name="phone")
	private String phone;

	@ApiModelProperty(value = "籍贯",name="nativePlace")
	private String nativePlace;

	@ApiModelProperty(value = "学生状态（1:待审批；2：已注册；3：已锁定）",name="status")
	private Byte status;


	public Long getId(){
		return id;
	}

	public void setId(Long id){
		this.id = id;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName2(){
		return name2;
	}

	public void setName2(String name){
		this.name2 = name;
	}

	public String getCode(){
		return code;
	}

	public void setCode(String code){
		this.code = code;
	}

	public String getBirthday(){
		return birthday;
	}

	public void setBirthday(String birthday){
		this.birthday = birthday;
	}

	public Byte getSex(){
		return sex;
	}

	public void setSex(Byte sex){
		this.sex = sex;
	}

	public String getNation(){
		return nation;
	}

	public void setNation(String nation){
		this.nation = nation;
	}

	public String getCollege(){
		return college;
	}

	public void setCollege(String college){
		this.college = college;
	}

	public String getMajor(){
		return major;
	}

	public void setMajor(String major){
		this.major = major;
	}

	public String getNationality(){
		return nationality;
	}

	public void setNationality(String nationality){
		this.nationality = nationality;
	}

	public Byte getStudentType(){
		return studentType;
	}

	public void setStudentType(Byte studentType){
		this.studentType = studentType;
	}

	public String getIdentity(){
		return identity;
	}

	public void setIdentity(String identity){
		this.identity = identity;
	}

	public String getPhone(){
		return phone;
	}

	public void setPhone(String phone){
		this.phone = phone;
	}

	public String getNativePlace(){
		return nativePlace;
	}

	public void setNativePlace(String nativePlace){
		this.nativePlace = nativePlace;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEntranceDate() {
		return entranceDate;
	}

	public void setEntranceDate(String entranceDate) {
		this.entranceDate = entranceDate;
	}

	public Byte getStatus() {
		return status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}
}
