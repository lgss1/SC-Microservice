package com.lg.crbook.dao;

import com.lg.crbook.bean.CrBook;
import com.lg.crbook.bean.CrBookExample;
import com.lg.crbook.bean.CrBookWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrBookMapper {
    long countByExample(CrBookExample example);

    int deleteByExample(CrBookExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CrBookWithBLOBs record);

    int insertSelective(CrBookWithBLOBs record);

    List<CrBookWithBLOBs> selectByExampleWithBLOBs(CrBookExample example);

    List<CrBook> selectByExample(CrBookExample example);

    CrBookWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CrBookWithBLOBs record, @Param("example") CrBookExample example);

    int updateByExampleWithBLOBs(@Param("record") CrBookWithBLOBs record, @Param("example") CrBookExample example);

    int updateByExample(@Param("record") CrBook record, @Param("example") CrBookExample example);

    int updateByPrimaryKeySelective(CrBookWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CrBookWithBLOBs record);

    int updateByPrimaryKey(CrBook record);
}