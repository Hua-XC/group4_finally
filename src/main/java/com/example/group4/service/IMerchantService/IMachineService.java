package com.example.group4.service.IMerchantService;

import com.example.group4.bean.Machine;

import java.util.List;

public interface IMachineService {

     List<Machine> findById(int id) throws RuntimeException;

    void editOrAddMac(Machine machine) throws RuntimeException;

    void delMac(int id)throws RuntimeException;
}