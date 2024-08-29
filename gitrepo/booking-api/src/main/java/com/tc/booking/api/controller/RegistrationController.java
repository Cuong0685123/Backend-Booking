package com.tc.booking.api.controller;

import com.tc.booking.model.entity.Account;
import com.tc.booking.model.entity.Customer;
import com.tc.booking.repo.AccountDAO;
import com.tc.booking.repo.CustomerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/register")
public class RegistrationController {

    @Autowired
    private AccountDAO accountDAO;

    @Autowired
    private CustomerDAO customerDAO;

    @PostMapping
    public String register(@RequestBody Customer customer) {
        // Kiểm tra xem tên người dùng đã tồn tại chưa
        Optional<Account> existingAccount = accountDAO.findByUsername(customer.getAccount().getUsername());
        if (existingAccount.isPresent()) {
            return "Tên người dùng đã tồn tại";
        }

        // Tạo tài khoản mới và lưu
        Account account = new Account();
        account.setUsername(customer.getAccount().getUsername());
        account.setPassword(customer.getAccount().getPassword());

        // Lưu tài khoản mới
        accountDAO.save(account);

        // Gán tài khoản cho khách hàng
        customer.setAccount(account);

        // Lưu khách hàng
        customerDAO.save(customer);

        return "Đăng ký thành công";
    }
}
