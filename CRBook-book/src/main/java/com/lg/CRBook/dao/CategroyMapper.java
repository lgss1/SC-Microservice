package com.lg.CRBook.dao;

import com.lg.crbook.bean.Categroy;
import com.lg.crbook.bean.CategroyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CategroyMapper {
    long countByExample(CategroyExample example);

    int deleteByExample(CategroyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Categroy record);

    int insertSelective(Categroy record);

    List<Categroy> selectByExample(CategroyExample example);

    Categroy selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Categroy record, @Param("example") CategroyExample example);

    int updateByExample(@Param("record") Categroy record, @Param("example") CategroyExample example);

    int updateByPrimaryKeySelective(Categroy record);

    int updateByPrimaryKey(Categroy record);
}