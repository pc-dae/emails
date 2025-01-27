package mn.dae.pc.emails.service;

import mn.dae.pc.emails.MainApplication;
import mn.dae.pc.emails.model.Email;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.autoconfigure.metrics.MetricsProperties;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.io.PrintWriter;

@Service
public class EmailService {

    private static final Logger log = LoggerFactory.getLogger(MainApplication.class);

    public void send(Email email) {
        try {
            System.out.println(email.getData().get("body"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
