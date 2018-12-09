package com.dlh.dao;

import com.dlh.entity.User;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class UserDao {

    @Resource
    private HibernateTemplate hibernateTemplate;

    public User queryUserById(Integer userId){
        return hibernateTemplate.get(User.class,userId);
    }


   /* public User queryUserById02(Integer userId){
        return  hibernateTemplate.execute(new HibernateCallback<User>() {
            public User doInHibernate(Session session) throws HibernateException {
                String sql="select id,user_name,user_pwd from t_user where id=?";
                session.createSQLQuery(sql);
                return null;
            }
        });
    }*/
}
