package hello;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity //jpa를 사용하는 애구나!
public class Member {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id //pk값을 알려줌
    private  Long id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private  String name;
}
