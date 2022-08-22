package app.domain.models;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
public abstract class Entity<TKey> implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected TKey id;

    public TKey getId() {
        return id;
    }

    public void setId(TKey id) {
        this.id = id;
    }
}
