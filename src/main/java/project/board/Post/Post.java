package project.board.Post;

public class Post {
    private Long id;
    private String title;
    private String content;
    private String password;

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

    public void setId(Long id) {
        this.id = id;
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
        content = content;
    }
}
