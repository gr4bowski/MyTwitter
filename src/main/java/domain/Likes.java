package domain;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="Likes")
public class Likes {
    private LikeId primary_key;
    
    @EmbeddedId
    public LikeId getPrimary_key() {
        return this.primary_key;
    }
    
    public void setPrimary_key(LikeId primary_key) {
        this.primary_key = primary_key;
    }
}
