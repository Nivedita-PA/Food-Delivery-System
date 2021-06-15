package FoodDelivery;

public class Customer {

    String mobileNum;//unique ID
    String address;
    String name;
    String emailId;

    public String getMobileNum() {
        return mobileNum;
    }

    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "mobileNum='" + mobileNum + '\'' +
                ", address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }
}
