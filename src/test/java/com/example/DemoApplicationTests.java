package com.example;

import com.kylo.demo.DemoApplication;
import com.kylo.demo.domain.User;
import com.kylo.demo.domain.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoApplication.class)
public class DemoApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void test() throws Exception {

        // 创建10条记录
        userRepository.save(new User("AAA", "", 1, 1));
        userRepository.save(new User("BBB", "", 1, 1));
        userRepository.save(new User("CCC", "", 1, 1));
        userRepository.save(new User("DDD", "", 1, 1));
        userRepository.save(new User("EEE", "", 1, 1));
        userRepository.save(new User("FFF", "", 1, 1));
        userRepository.save(new User("GGG", "", 1, 1));
        userRepository.save(new User("HHH", "", 1, 1));
        userRepository.save(new User("III", "", 1, 1));
        userRepository.save(new User("JJJ", "", 1, 1));

        // 测试findAll, 查询所有记录
        Assert.assertEquals(10, userRepository.findAll().size());

        // 测试findByName, 查询姓名为FFF的User
        Assert.assertEquals(1, userRepository.findByUserName("FFF").getUserType().intValue());

        // 测试findByNameAndAge, 查询姓名为FFF并且年龄为60的User
        Assert.assertEquals("FFF", userRepository.findByUserNameAndUserType("FFF", 1).getUserName());

        // 测试删除姓名为AAA的User
        userRepository.delete(userRepository.findByUserName("AAA"));

        // 测试findAll, 查询所有记录, 验证上面的删除是否成功
        Assert.assertEquals(9, userRepository.findAll().size());

    }

}
