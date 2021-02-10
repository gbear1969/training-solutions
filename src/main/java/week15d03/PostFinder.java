package week15d03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PostFinder {
    private List<Post> posts = new ArrayList<>();

    public PostFinder(List<Post> posts) {
        this.posts.addAll(posts);
    }

    public List<Post> findPostsFor(String user) {
        List<Post> selectedPosts = new ArrayList<>();
        for (Post p: posts) {
            if (p.getOwner().equals(user) && !p.getContent().isEmpty()
                    && !p.getTitle().isEmpty() && p.getPublishedAt().isBefore(LocalDate.now()));
            selectedPosts.add(p);
        }
        return selectedPosts;
    }

    public List<Post> getPosts() {
        return posts;
    }
}
