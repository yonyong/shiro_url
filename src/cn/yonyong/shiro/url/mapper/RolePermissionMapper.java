package cn.yonyong.shiro.url.mapper;

import cn.yonyong.shiro.url.pojo.RolePermission;
import cn.yonyong.shiro.url.pojo.RolePermissionExample;

import java.util.List;

public interface RolePermissionMapper {
	int deleteByPrimaryKey(Long id);

	int insert(RolePermission record);

	int insertSelective(RolePermission record);

	List<RolePermission> selectByExample(RolePermissionExample example);

	RolePermission selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(RolePermission record);

	int updateByPrimaryKey(RolePermission record);
}