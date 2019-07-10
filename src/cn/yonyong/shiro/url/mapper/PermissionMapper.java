package cn.yonyong.shiro.url.mapper;

import cn.yonyong.shiro.url.pojo.Permission;
import cn.yonyong.shiro.url.pojo.PermissionExample;

import java.util.List;

public interface PermissionMapper {
	int deleteByPrimaryKey(Long id);

	int insert(Permission record);

	int insertSelective(Permission record);

	List<Permission> selectByExample(PermissionExample example);

	Permission selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(Permission record);

	int updateByPrimaryKey(Permission record);
}