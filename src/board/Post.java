package board;

import java.time.LocalDateTime;

public class Post {

    private int id;
    private String subject;
    private String contents;
    private String writer;
    private LocalDateTime postDate;

    public Post(String subject, String contents, String writer) {
        this.subject = subject;
        this.contents = contents;
        this.writer = writer;
        this.postDate = LocalDateTime.now();
    }


    public Integer getId() {
        return this.id;
    }

    public String getSubject() {
        return subject;
    }

    public String getContents() {
        return contents;
    }

    public String getWriter() {
        return writer;
    }

    public LocalDateTime getPostDate() {
        return postDate;
    }

    public void setId(int idx) {
        this.id = idx;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", subject='" + subject + '\'' +
                ", contents='" + contents + '\'' +
                ", writer='" + writer + '\'' +
                ", postDate=" + postDate +
                '}';
    }
}
