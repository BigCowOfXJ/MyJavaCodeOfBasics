package View;

public class House_Instance {
    //这是房屋信息存储类

    //属性
    private String name;
    private String number;
    private String address;
    private double rent;
    private String status = "未租";

    public House_Instance(String name, String number, String address, double rent, String status) {
        this.name = name;
        this.number = number;
        this.address = address;
        this.rent = rent;
        this.status = status;
    }
    public House_Instance(){

    }

    //构造函数就是无参构造器就行


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
