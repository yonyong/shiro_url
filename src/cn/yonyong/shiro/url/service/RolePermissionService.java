package cn.yonyong.shiro.url.service;

import cn.yonyong.shiro.url.pojo.Role;

public interface RolePermissionService {
	public void setPermissions(Role role, long[] permissionIds);

	public void deleteByRole(long roleId);

	public void deleteByPermission(long permissionId);
}