package com.jpmc.midascore.Controller;

import com.jpmc.midascore.entity.UserRecord;
import com.jpmc.midascore.foundation.Balance;
import com.jpmc.midascore.repository.UserRecordRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {

    private final UserRecordRepository userRepo;

    public BalanceController(UserRecordRepository userRepo) {
        this.userRepo = userRepo;
    }

    @GetMapping("/balance")
    public Balance getBalance(@RequestParam("userId") long userId) {
        float bal = userRepo.findById(userId)
                .map(UserRecord::getBalance)
                .orElse(0f);

        return new Balance(bal);
    }
}