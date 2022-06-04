package iterator;

import java.time.LocalDateTime;
import lombok.Getter;

@Getter
public class Post {

    private String content;
    private LocalDateTime createdDateTime;

    public Post(String content) {
        this.content = content;
        this.createdDateTime = LocalDateTime.now();
    }
}
