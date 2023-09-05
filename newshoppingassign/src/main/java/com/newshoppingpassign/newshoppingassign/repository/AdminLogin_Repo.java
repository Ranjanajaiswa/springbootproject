package com.newshoppingpassign.newshoppingassign.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.newshoppingpassign.newshoppingassign.model.AdminLogin;




public interface AdminLogin_Repo extends JpaRepository<AdminLogin,String>{
    AdminLogin findByAdmin(String admin);
    AdminLogin findByPassword(String password);

    AdminLogin findByAdminAndPassword(String admin, String password);
    
}
