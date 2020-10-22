package pojo;

public class User {
    private String name;
    private Address address;

    public User() {
        System.out.println("initialize the bean!");
    }

    public String getName() {
        return name;
    }

    //没有set函数 无法使用xml注入
    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
