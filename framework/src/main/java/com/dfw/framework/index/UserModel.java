package com.dfw.framework.index;

import java.util.*;

/**
 * 用户信息 实体
 * @author Peter
 */
public class UserModel implements java.io.Serializable {
	private static final long serialVersionUID = 7300833878298914517L;
	private String user_id;	//用户id
	private String org_code;	//单位code
	private String depart_code;	//部门code
	private String org_id;	//单位id
	private String depart_id;	//部门id
	private String user_account;	//用户登录账号
	private String user_name;	//用户名称
	private String user_sex;	//性别
	private String user_pwd;	//用户密码
	
	private String user_pos;	//职务
	private String idcard_no;	//身份证
	private String ca_id;	//ca
	private String picture_name;	//头像文件名
	
	private String office_tel;	//电话
	private String office_fax;	//传真
	private String mobile;	//手机
	private String email;	//电子邮件
	private String validity;	//是否有效
	private String order_no ;

	private Date create_time;	//创建时间
	private Date update_time;	//更新时间

	
	//附件加
	private boolean isSuperAdmin;
	private String depart_ids;
	private String depart_codes;
	private String subdepart_code;
	private String roleIds;	//对应角色ids
	private String userIsAdmin="0";
	private String levelId;
	private String pwdOld;
	private String orgRoles;	//json格式的此单位可以使用的角色信息
	private String orgCodes;
	private String menuCodes;
	private Map<String, String> extData = new HashMap<String, String>();	//扩展信息

	public Map<String, String> getExtData() {
		return extData;
	}
	public void setExtData(Map<String, String> extData) {
		this.extData = extData;
	}
	public String getOrgCodes() {
		return orgCodes;
	}
	public void setOrgCodes(String orgCodes) {
		this.orgCodes = orgCodes;
	}
	public String getMenuCodes() {
		return menuCodes;
	}
	public void setMenuCodes(String menuCodes) {
		this.menuCodes = menuCodes;
	}
	private String orgName;
	private String departName;
	
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getDepartName() {
		return departName;
	}
	public void setDepartName(String departName) {
		this.departName = departName;
	}
	public String getOrgRoles() {
		return orgRoles;
	}
	public void setOrgRoles(String orgRoles) {
		this.orgRoles = orgRoles;
	}
	public String getPwdOld() {
		return pwdOld;
	}
	public void setPwdOld(String pwdOld) {
		this.pwdOld = pwdOld;
	}
	public String getLevelId() {
		return levelId;
	}
	public void setLevelId(String levelId) {
		this.levelId = levelId;
	}
	public String getUserIsAdmin() {
		return userIsAdmin;
	}
	public void setUserIsAdmin(String userIsAdmin) {
		this.userIsAdmin = userIsAdmin;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getOrg_code() {
		return org_code;
	}
	public void setOrg_code(String org_code) {
		this.org_code = org_code;
	}
	public String getDepart_code() {
		return depart_code;
	}
	public void setDepart_code(String depart_code) {
		this.depart_code = depart_code;
	}
	public String getOrg_id() {
		return org_id;
	}
	public void setOrg_id(String org_id) {
		this.org_id = org_id;
	}
	public String getDepart_id() {
		return depart_id;
	}
	public void setDepart_id(String depart_id) {
		this.depart_id = depart_id;
	}
	public String getUser_account() {
		return user_account;
	}
	public void setUser_account(String user_account) {
		this.user_account = user_account;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_sex() {
		return user_sex;
	}
	public void setUser_sex(String user_sex) {
		this.user_sex = user_sex;
	}
	public String getUser_pwd() {
		return user_pwd;
	}
	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}
	public String getUser_pos() {
		return user_pos;
	}
	public void setUser_pos(String user_pos) {
		this.user_pos = user_pos;
	}
	public String getIdcard_no() {
		return idcard_no;
	}
	public void setIdcard_no(String idcard_no) {
		this.idcard_no = idcard_no;
	}
	public String getCa_id() {
		return ca_id;
	}
	public void setCa_id(String ca_id) {
		this.ca_id = ca_id;
	}
	public String getPicture_name() {
		return picture_name;
	}
	public void setPicture_name(String picture_name) {
		this.picture_name = picture_name;
	}
	public String getOffice_tel() {
		return office_tel;
	}
	public void setOffice_tel(String office_tel) {
		this.office_tel = office_tel;
	}
	public String getOffice_fax() {
		return office_fax;
	}
	public void setOffice_fax(String office_fax) {
		this.office_fax = office_fax;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getValidity() {
		return validity;
	}
	public void setValidity(String validity) {
		this.validity = validity;
	}
	public String getOrder_no() {
		return order_no;
	}
	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}
	public boolean isSuperAdmin() {
		return isSuperAdmin;
	}
	public void setSuperAdmin(boolean isSuperAdmin) {
		this.isSuperAdmin = isSuperAdmin;
	}
	public String getDepart_ids() {
		return depart_ids;
	}
	public void setDepart_ids(String depart_ids) {
		this.depart_ids = depart_ids;
	}
	public String getDepart_codes() {
		return depart_codes;
	}
	public void setDepart_codes(String depart_codes) {
		this.depart_codes = depart_codes;
	}
	public String getSubdepart_code() {
		return subdepart_code;
	}
	public void setSubdepart_code(String subdepart_code) {
		this.subdepart_code = subdepart_code;
	}
	public String getRoleIds() {
		return roleIds;
	}
	public void setRoleIds(String roleIds) {
		this.roleIds = roleIds;
	}

	public String getExtDataValue(String key) {
		if(extData!=null){
			return extData.get(key);
		}else{
			return null;
		}
	}
	public void setExtDataValue(String key,String value) {
		if(extData==null){
			extData=new LinkedHashMap<String, String>();
		}
		extData.put(key,value);
	}
	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public Date getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}
}