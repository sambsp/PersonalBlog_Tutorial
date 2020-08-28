package DefaultMain.Model;

import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotBlank;

public class Catalog {
    @Id
    private String id;

    @NotBlank(message = "name cannot be empty")
    private String name;

    private String createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
