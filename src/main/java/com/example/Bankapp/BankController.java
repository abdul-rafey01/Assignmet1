package com.example.Bankapp;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {
    @GetMapping("/bankName")
    public String getBankName() {
        Bank bank = new Bank();
        bank.setName("SBI BANK");
        return bank.getName();
    }

    @GetMapping("/bankAddress")
    public String getBankAddress() {
        Bank bank = new Bank();
        bank.setAddress("Post Bag No.5310, State Bank Road, Banglore 560001");
        return bank.getAddress();
    }
}
