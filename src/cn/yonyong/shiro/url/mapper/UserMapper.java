package cn.yonyong.shiro.url.mapper;

import cn.yonyong.shiro.url.pojo.User;
import cn.yonyong.shiro.url.pojo.UserExample;

import java.util.List;

public interface UserMapper {
	int deleteByPrimaryKey(Long id);

	int insert(User record);

	int insertSelective(User record);

	List<User> selectByExample(UserExample example);

	User selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);
}