package vinhl.prm391.dtos;

import java.io.Serializable;

public class UserDTO implements Serializable {
    String username, password, groupName;

    public UserDTO() {
    }

    public UserDTO(String username, String password, String groupName) {
        this.username = username;
        this.password = password;
        this.groupName = groupName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
