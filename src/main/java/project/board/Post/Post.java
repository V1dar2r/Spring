package project.board.Post;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Post {
    @GeneratedValue // 기본 키를 자동으로 설정 (순차적으로 생성)
    @Id // 해당 필드를 기본키로 설정하는 어노테이션
    private Long id;
    private String title;
    private String content;
    private String password;

    public Post(){}

    public Post(Long id, String title, String content,String password) {
        this.title = title;
        this.id = id;
        this.content = content;
        this.password = password;
    }

    public Post(String title, String content, String password) {
        this.title = title;
        this.content = content;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
