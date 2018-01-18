package com.laizi.dao;

import com.laizi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by denghaowei on 2018/1/18.
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
