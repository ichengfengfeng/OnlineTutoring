package com.icff.tutoring.mapper;

import com.icff.tutoring.po.User;
import com.icff.tutoring.po.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(String uuid);

    int insert(User record);

    int insertSelective(User record);
    /**
     * 插入用户并uuid（）生成主键uuid
     * @param record
     * @return
     */
    int insertUser(User record);
    
    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    User selectByUserName(String userName);
    
    User selectByUnameAndPassword(@Param("username") String username,@Param("password") String password);
    
    User selectUserByuuidAndpassword(@Param("uuid")String uuid,@Param("password")String password);

}