package ru.kata.spring.boot_security.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kata.spring.boot_security.demo.dao.RoleDAO;
import ru.kata.spring.boot_security.demo.entities.Role;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService{

    private RoleDAO roleDAO;

    @Autowired
    public RoleServiceImpl(RoleDAO roleDAO) {
        this.roleDAO = roleDAO;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Role> findAll() {
        return roleDAO.findAll();
    }

    @Override
    public void saveRole(Role role) {
        roleDAO.saveRole(role);
    }
}
