package com.manula.springrolejwt.service;

import com.manula.springrolejwt.model.Role;

public interface RoleService {
    Role findByName(String name);
}
