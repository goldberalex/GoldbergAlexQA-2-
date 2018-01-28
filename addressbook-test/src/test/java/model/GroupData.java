package model;

import java.util.Objects;

public class GroupData {
    private int id;
    private String name;
    private String header;
    private String footer;



    public void wihtId(int id) {
        this.id = id;
    }

    public GroupData wihtName(String name) {
        this.name = name;
        return this;
    }

    public GroupData wihtHeader(String header) {
        this.header = header;
        return this;
    }

    public GroupData wihtFooter(String footer) {
        this.footer = footer;
        return this;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupData groupData = (GroupData) o;
        return id == groupData.id &&
                Objects.equals(name, groupData.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "GroupData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getHeader() {
        return header;
    }

    public String getFooter() {
        return footer;
    }

}
