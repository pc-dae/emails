package mn.dae.pc.emails.model;

import java.util.Map;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Email {
    private final String recipient; // Single recipient for PofC
    private final Map<String, String> data;
}

