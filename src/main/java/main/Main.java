package main;

import model.Comment;
import proxies.EmailCommentNotificationProxy;
import repositories.DBCCommentRepository;
import services.CommentService;

public class Main {
    public static void main(String[] args) {
        var commentRepository = new DBCCommentRepository();
        var commentNotificationProxy = new EmailCommentNotificationProxy();
        var commentService = new CommentService(commentRepository, commentNotificationProxy);

        var comment = new Comment();
        comment.setAuthor("Maxim");
        comment.setText("Demo comment");

        commentService.publishComment(comment);
    }
}