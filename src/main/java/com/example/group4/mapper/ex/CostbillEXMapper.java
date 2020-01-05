package com.example.group4.mapper.ex;

import com.example.group4.bean.ex.CostBillEX;

import java.util.Date;
import java.util.List;

public interface CostbillEXMapper {
    List<CostBillEX> findAll(int start, int pagesize);
    List<CostBillEX>findByMoney(double money);
    double sum();
    List<CostBillEX>findByTime(int day);
    double sumByTime(int day);

    double[] consume(int id, Date date);
}
