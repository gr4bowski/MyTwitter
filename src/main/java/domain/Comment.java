package domain;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Comment {
    private CommentId primary_key;
    private String text;

    @EmbeddedId
    public CommentId getPrimary_key() {
        return this.primary_key;
    }

    public void setPrimary_key(CommentId primary_key) {
        this.primary_key = primary_key;
    }

    @Column(length=256)
    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
