package com.czc.controller;

import com.czc.entity.User;
import com.czc.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author czc
 * @since 2023-06-23
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    //查询全部
    @GetMapping("/list")
    public List<User> list(){
        userService.list().forEach(System.out::println);
        return userService.list();
    }
    //修改
    @PostMapping("/mod")
    public boolean mod(@RequestBody User user){
        return userService.updateById(user);
    }
    //新增或修改
    @PostMapping("/saveOrMod")
    public boolean saveOrMod(@RequestBody User user){
        return userService.saveOrUpdate(user);
    }
    //删除
    @GetMapping("/delete")
    public boolean delete(@RequestParam("id") Integer id){
        return userService.removeById(id);
    }
}
