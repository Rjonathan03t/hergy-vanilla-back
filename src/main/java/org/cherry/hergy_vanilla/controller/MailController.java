package org.cherry.hergy_vanilla.controller;

import org.cherry.hergy_vanilla.dto.MailRequest;
import org.cherry.hergy_vanilla.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/contact")
public class MailController {

    @Autowired
    private MailService mailService;

    @PostMapping
    public MailRequest sendMail(@RequestBody MailRequest mailRequest) {
        return mailService.sendMail(mailRequest);
    }
}
