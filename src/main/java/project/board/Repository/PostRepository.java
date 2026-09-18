package project.board.Repository;

import project.board.Post.Post;
import project.board.Post.PostResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface PostRepository {

    public Post save(Post post);
    public Optional<Post> findById(Long id);
    public List<Post> findAll();

}
