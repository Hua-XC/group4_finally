package com.example.group4.service.Manage;

import com.example.group4.bean.Student;

public interface IManagerService {
    void ModifyStudent(Student student);
    void freeze(int card_id,int manager_id);
    void abfreeze(int card_id,int manager_id);
}
