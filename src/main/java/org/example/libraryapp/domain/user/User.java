package org.example.libraryapp.domain.user;

public class User {
    private String name;
    private Integer age;

    public User(String name, Integer age) {
        if(name==null || name.isBlank()){
            throw new IllegalArgumentException(String.format("잘못된 name(%s)이 들어왔습니다.", name));} // name이 null이거나 공백일 경우 IllegalArgumentException을 던집니다.
        //IllegalArguementException이란? : 잘못된 인자가 들어왔을 때 발생하는 예외입니다.
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

}
