package cn.yonyong.shiro.url.service;

import cn.yonyong.shiro.url.pojo.User;

public interface UserRoleService {

	public void setRoles(User user, long[] roleIds);

	public void deleteByUser(long userId);

	public void deleteByRole(long roleId);

}