package ru.molcom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.molcom.entity.User;
import ru.molcom.service.interfaces.UserService;

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    public UserService userService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/users")
    public String getAllUsers(Model model) {

        model.addAttribute("users", userService.findAll());

        return "users_list";
    }

    @GetMapping("/user/{id}")
    public String getById(@PathVariable("id") Long id, Model model) {

        model.addAttribute("user", userService.getById(id));

        return "show_user";
    }

    @GetMapping("/add_user")
    public String createUserPage() {
        return "add_user";
    }

    @PostMapping("/add_user")
    public String addUser(@ModelAttribute("user") User user) throws Exception {
        userService.save(user);
        return "redirect:/users";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") Long id) {
        userService.delete(id);
        return "redirect:/users";
    }

    @PostMapping("/edit_user")
    public String updateUser(@ModelAttribute("user") User user) {
        userService.update(user);
        return "redirect:/user/" + user.getId();
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable("id") Long id, Model model) {
        model.addAttribute("user", userService.getById(id));
        return "edit_user";
    }
}
