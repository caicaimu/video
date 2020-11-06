package com.liu.server.dto;


/**
 * 这个实体类和生成实体类 大体是一样的
 * 因为生成的实体类我们是无法修改的
 * 所有增加一个新的
 * 这个实体类给controller层和service使用
 * 生成的实体则是给dao层和service使用的
 *
 */
public class ChapterDto {
    private String id;

    private String courseId;

    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", courseId=").append(courseId);
        sb.append(", name=").append(name);
        sb.append("]");
        return sb.toString();
    }
}