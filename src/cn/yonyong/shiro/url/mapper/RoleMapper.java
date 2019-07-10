package cn.yonyong.shiro.url.mapper;

import cn.yonyong.shiro.url.pojo.Role;
import cn.yonyong.shiro.url.pojo.RoleExample;

import java.util.List;

public interface RoleMapper {
	int deleteByPrimaryKey(Long id);

	int insert(Role record);

	int insertSelective(Role record);

	List<Role> selectByExample(RoleExample example);

	Role selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(Role record);

	int updateByPrimaryKey(Role record);
}