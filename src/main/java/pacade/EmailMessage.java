package pacade;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class EmailMessage {

    private String from;
    private String to;
    private String subject;
    private String text;
}
