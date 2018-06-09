package com.itheima.ssm.service.Impl;
import com.itheima.ssm.entity.SCust;
import com.itheima.ssm.entity.SUser;
import com.itheima.ssm.entity.SUserExample;
import com.itheima.ssm.mapper.SCustMapper;
import com.itheima.ssm.mapper.SUserMapper;
import com.itheima.ssm.service.SUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SUserServiceImpl implements SUserService{
    @Autowired
    private SUserMapper suserMapper;

    @Autowired
    private SCustMapper custMapper;

    public SUser selectSUserByObj(SUser obj){

        SUserExample example = new SUserExample();
        SUserExample.Criteria criteria = example.createCriteria();

        criteria.andUsernameEqualTo(obj.getUsername());
        criteria.andPasswordEqualTo(obj.getPassword());

        List<SUser> users = suserMapper.selectByExample(example);
        if(users !=null  && users.size()>0){
            return users.get(0);
        }
        return null;
    }

    /**
     * 遍历所有客户
     * @return
     */
    @Override
    public List<SCust> getCustList() {
        List<SCust> sCusts = custMapper.selectByExample(null);
        return sCusts;
    }

    /**
     * 根据id删除客户
     * @param id
     */
    @Override
    public void delectCust(String id) {
        custMapper.deleteByPrimaryKey(Integer.valueOf(id));
    }

}