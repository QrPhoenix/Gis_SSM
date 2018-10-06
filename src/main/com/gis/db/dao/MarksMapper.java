package com.gis.db.dao;

import com.gis.db.model.Marks;
import com.gis.db.model.MarksExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarksMapper {
    int countByExample(MarksExample example);

    int deleteByExample(MarksExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Marks record);

    int insertSelective(Marks record);

    List<Marks> selectByExample(MarksExample example);

    Marks selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Marks record, @Param("example") MarksExample example);

    int updateByExample(@Param("record") Marks record, @Param("example") MarksExample example);

    int updateByPrimaryKeySelective(Marks record);

    int updateByPrimaryKey(Marks record);
}