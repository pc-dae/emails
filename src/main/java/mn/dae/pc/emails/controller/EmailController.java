package mn.dae.pc.emails.controller;

import mn.dae.pc.emails.model.Email;
import mn.dae.pc.emails.service.EmailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/email")
public class EmailController {

    private static final Logger log = LoggerFactory.getLogger(EmailController.class);

    @Autowired
    private EmailService emailService;

    // create an email item
    @ResponseStatus(HttpStatus.CREATED) // 201
    @PostMapping
    public void send(@RequestBody Email email) {

        emailService.send(email);
    }
}
