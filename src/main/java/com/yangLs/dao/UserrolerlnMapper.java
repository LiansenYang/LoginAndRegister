package com.yangLs.dao;

import com.yangLs.model.UserrolerlnExample;
import com.yangLs.model.UserrolerlnKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserrolerlnMapper {
    long countByExample(UserrolerlnExample example);

    int deleteByExample(UserrolerlnExample example);

    int deleteByPrimaryKey(UserrolerlnKey key);

    int insert(UserrolerlnKey record);

    int insertSelective(UserrolerlnKey record);

    List<UserrolerlnKey> selectByExample(UserrolerlnExample example);

    int updateByExampleSelective(@Param("record") UserrolerlnKey record, @Param("example") UserrolerlnExample example);

    int updateByExample(@Param("record") UserrolerlnKey record, @Param("example") UserrolerlnExample example);
}