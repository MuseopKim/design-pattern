package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lombok.Getter;

@Getter
public class Board {

    private List<Post> posts = new ArrayList<>();

    public void addPost(String content) {
        posts.add(new Post(content));
    }

    public Iterator<Post> getRecentPostIterator() {
        return new RecentPostIterator(this.posts);
    }
}
