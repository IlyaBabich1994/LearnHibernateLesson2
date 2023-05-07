package org.hiber.service;

import org.hiber.dao.UserDao;
import org.hiber.model.Car;
import org.hiber.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserServiceImpl implements UserService{

    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public void addCarToUser(Long userId, Car car) {

    }

    public void addUser(User user) {

    }

    public void removeCarFromUser(Long userId, Long carId) {

    }

    public List<User> getAllUsers() {
        return null;
    }

    public User getUserById(Long id) {
        return null;
    }

    public List<Car> getCarsByUserId(Long userId) {
        return null;
    }

    public Car getCarById(Long id) {
        return null;
    }
}
