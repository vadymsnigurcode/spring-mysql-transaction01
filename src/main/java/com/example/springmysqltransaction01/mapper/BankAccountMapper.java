package com.example.springmysqltransaction01.mapper;

import com.example.springmysqltransaction01.model.BankAccountInfo;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BankAccountMapper implements RowMapper<BankAccountInfo> {

    public static final String BASE_SQL //
            = "Select ba.Id, ba.Full_Name, ba.Balance From BANK_ACCOUNT ba ";

    @Override
    public BankAccountInfo mapRow(ResultSet rs, int rowNum) throws SQLException {

        Long id = rs.getLong("Id");
        String fullName = rs.getString("Full_Name");
        double balance = rs.getDouble("Balance");

        return new BankAccountInfo(id, fullName, balance);
    }

}
