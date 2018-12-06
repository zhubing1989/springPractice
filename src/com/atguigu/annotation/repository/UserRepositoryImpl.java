package com.atguigu.annotation.repository;

<<<<<<< HEAD
public class UserRepositoryImpl implements UserRepository {
    @Override
    public void save() {
        System.out.println("UserRepository save....");
=======
import org.springframework.stereotype.Repository;

@Repository(value = "userRepository")
public class UserRepositoryImpl implements UserRepository
{
    @Override
    public void save()
    {
        System.out.println("UserRepository save");
>>>>>>> 097991d221775ca25d847b106a81c3e94ba10bb6
    }
}
