package project.board.Repository;

import org.springframework.stereotype.Repository;
import project.board.Post.Post;

import java.util.List;
import java.util.Optional;

@Repository
public class JpaPostRepository implements PostRepository{
    private final JPARepository jpaRepository;

    public JpaPostRepository(JPARepository jpaRepository){
        this.jpaRepository = jpaRepository;
    }

    @Override
    public Post save(Post post) {
        return jpaRepository.save(post);

    }

    @Override
    public Optional<Post> findById(Long id) {
        return jpaRepository.findById(id);
    }

    @Override
    public List<Post> findAll() {
        return jpaRepository.findAll();
    }
}
