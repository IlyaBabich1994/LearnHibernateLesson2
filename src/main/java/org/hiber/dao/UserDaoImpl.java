package org.hiber.dao;

import jakarta.transaction.Transactional;
import org.hiber.model.Car;
import org.hiber.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {

    @Autowired
    private final SessionFactory sessionFactory;

    public UserDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
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
