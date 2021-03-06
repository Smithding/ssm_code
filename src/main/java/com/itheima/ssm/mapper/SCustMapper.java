package com.itheima.ssm.mapper;

import com.itheima.ssm.entity.SCust;
import com.itheima.ssm.entity.SCustExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SCustMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_cust
     *
     * @mbggenerated
     */
    int countByExample(SCustExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_cust
     *
     * @mbggenerated
     */
    int deleteByExample(SCustExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_cust
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer cid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_cust
     *
     * @mbggenerated
     */
    int insert(SCust record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_cust
     *
     * @mbggenerated
     */
    int insertSelective(SCust record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_cust
     *
     * @mbggenerated
     */
    List<SCust> selectByExample(SCustExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_cust
     *
     * @mbggenerated
     */
    SCust selectByPrimaryKey(Integer cid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_cust
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SCust record, @Param("example") SCustExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_cust
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SCust record, @Param("example") SCustExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_cust
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SCust record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_cust
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SCust record);
}