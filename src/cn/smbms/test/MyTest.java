package cn.smbms.test;

import cn.smbms.dao.user.UserMapper;
import cn.smbms.pojo.User;
import cn.smbms.service.user.UserService;
import cn.smbms.service.user.UserServiceImpl;
import org.junit.Test;

import java.util.Date;

/**
 * @Author: 四两数字先生（公众号/CSDN）
 */
public class MyTest {

    private UserService userService=new UserServiceImpl();

    @Test
    public void addUserTest(){
        User user = new User();
        /*
        *
        *     insert into smbms_user(userCode,userName,userPassword,gender,birthday,phone,address,userRole)
        values(#{userCode},#{userName},#{userPassword},#{gender},#{birthday},#{phone},#{address},#{userRole})
        *
        * */
        user.setUserCode("nj65");
        user.setUserName("nj65");
        user.setUserPassword("nj65");
        user.setGender(1);
        Date birthDate= new Date();
        user.setBirthday(birthDate);
        user.setPhone("1234322332");
        user.setAddress("南京市");
        user.setUserRole(2);

        int i = userService.addUser(user);

        System.out.println("i为"+i);
    }
}
