package com.wei.oa.dao;

import com.wei.oa.entity.Node;
import com.wei.oa.utils.MybatisUtils;

import java.util.List;

/**
 * @author wei
 * @date 2021/10/15 18:17
 * @description: TODO
 */
public class RbacDao {
    public List<Node> selectNodeByUserId(Long userId) {
        return (List)MybatisUtils.executeQuery(sqlSession -> sqlSession.selectList("rbacmapper.selectNodeByUserId", userId));
    }
}
