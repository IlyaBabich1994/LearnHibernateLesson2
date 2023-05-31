package org.hiber.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.hiber.model.Car;
import org.hiber.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private final EntityManager entityManager;

    public UserDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void addCarToUser(Long userId, Car car) {

    }

    @Override
    public void saveUser(User user) {

    }

    @Override
    public void removeCarFromUser(Long carId) {

    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public User getUserById(Long id) {
        return null;
    }

    @Override
    public List<Car> getCarsByUserId(Long userId) {
        return null;
    }

    @Override
    public Car getCarById(Long id) {
        return null;
    }
}
