package project.board.Repository;

import org.springframework.stereotype.Repository;
import project.board.Post.Post;


import java.util.*;

@Repository
public class MemoryPostRepository implements PostRepository {
    private final Map<Long, Post> store = new HashMap<>();
    private Long nextId = 1L;

    @Override
    public Post save(Post post) {
        Long id = nextId++;
        post.setId(id);
        store.put(id,post);
        return post;
    }

    @Override
    public Optional<Post> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public List<Post> findAll() {
        return new ArrayList<Post>(store.values());
    }
}
