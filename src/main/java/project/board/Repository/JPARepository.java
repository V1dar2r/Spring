package project.board.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.board.Post.Post;

public interface JPARepository extends JpaRepository<Post,Long> {
}
