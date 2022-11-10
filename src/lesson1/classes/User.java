package lesson1.classes;

import java.util.Arrays;

public class User {
    private int id;
    private String name;
    private boolean status;
    private String[] skills;


    public User() {
    }

    public User(int id, String name, boolean status, String[] skills) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.skills = skills;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", skills=" + Arrays.toString(skills) +
                '}';
    }
}
