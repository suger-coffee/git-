package com.sugercoffee.community.dao;

import com.sugercoffee.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {

    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    // Param：参数
    // 这个注解是用于给参数取别名的
    // 如果只有一个参数，并且在<if>里使用，必须有别名
    int selectDiscussPostRows(@Param("userId") int userId);

}
