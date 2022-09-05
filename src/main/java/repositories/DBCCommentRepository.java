package repositories;

import model.Comment;
import org.springframework.stereotype.Repository;

@Repository
public class DBCCommentRepository implements CommentRepository {
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText());
    }
}
