package board;

import java.util.List;

public interface PostService {
    boolean writePost(String subject, String contents, String writer);

    boolean searchPost(int id);
    boolean searchAllPost();
    boolean updatePost(int id, String subject, String contents, String writer);
    boolean deletePost(int id);
}
