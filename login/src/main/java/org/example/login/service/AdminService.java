package org.example.login.service;

import org.example.login.model.Admin;
import org.example.login.dao.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    @Autowired
    private AdminRepository adminRepository;

    public List<Admin> findAll() {
        return adminRepository.findAll();
    }

    public Admin save(Admin admin) {
        return adminRepository.save(admin);
    }
    public Admin update(Admin admin) {
        return adminRepository.save(admin);
    }
    public void delete(Admin admin) {
        adminRepository.delete(admin);
    }


}
