package com.springboot.springbootsecurity.admin.service;

import com.springboot.springbootsecurity.admin.model.Admin;
import com.springboot.springbootsecurity.auth.model.dto.request.AdminRegisterRequest;

public interface AdminRegisterService {

    Admin registerAdmin(final AdminRegisterRequest adminRegisterRequest);
}
