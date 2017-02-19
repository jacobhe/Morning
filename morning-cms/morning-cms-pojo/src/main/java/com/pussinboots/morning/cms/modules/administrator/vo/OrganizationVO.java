package com.pussinboots.morning.cms.modules.administrator.vo;

import java.util.List;

import com.pussinboots.morning.cms.modules.administrator.entity.Organization;
import com.pussinboots.morning.cms.modules.administrator.entity.User;

public class OrganizationVO extends Organization {

	private static final long serialVersionUID = 1L;
	
	/** 管理员列表 */
	private List<User> users;
	
	/** 管理员数量 */
	private Integer numberUser;

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public Integer getNumberUser() {
		return numberUser;
	}

	public void setNumberUser(Integer numberUser) {
		this.numberUser = numberUser;
	}

}
