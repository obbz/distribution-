package com.ojp.dao;

import com.ojp.entity.DisHandovers;
import com.ojp.entity.DisHandoversExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DisHandoversMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_handovers
     *
     * @mbg.generated
     */
    long countByExample(DisHandoversExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_handovers
     *
     * @mbg.generated
     */
    int deleteByExample(DisHandoversExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_handovers
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String hStartdisCity);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_handovers
     *
     * @mbg.generated
     */
    int insert(DisHandovers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_handovers
     *
     * @mbg.generated
     */
    int insertSelective(DisHandovers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_handovers
     *
     * @mbg.generated
     */
    List<DisHandovers> selectByExample(DisHandoversExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_handovers
     *
     * @mbg.generated
     */
    DisHandovers selectByPrimaryKey(String hStartdisCity);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_handovers
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") DisHandovers record, @Param("example") DisHandoversExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_handovers
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") DisHandovers record, @Param("example") DisHandoversExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_handovers
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(DisHandovers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_handovers
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DisHandovers record);
}