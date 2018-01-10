/*
Danh sách khách hàng gồm : Mã khách hàng, họ tên, CMND, địa chỉ, số điện thoại,
email, tên thú cưng của họ,
 */
package pet.care.model;

/**
 *
 * @author nguye
 */
public class CustomerModel {
    private String id;
    private String name;
    private int sex;
    private String citizenId;
    private String address;
    private String phone;
    private String email;
    private int numPet;
    
    public CustomerModel() {
        this.sex = 0;
    }

    public CustomerModel(String id, String name, int sex, String citizenId, String address, String phone, String email, int numPet) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.citizenId = citizenId;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.numPet = numPet;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the sex
     */
    public int getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(int sex) {
        this.sex = sex;
    }

    /**
     * @return the citizenId
     */
    public String getCitizenId() {
        return citizenId;
    }

    /**
     * @param citizenId the citizenId to set
     */
    public void setCitizenId(String citizenId) {
        this.citizenId = citizenId;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the numPet
     */
    public int getNumPet() {
        return numPet;
    }

    /**
     * @param numPet the numPet to set
     */
    public void setNumPet(int numPet) {
        this.numPet = numPet;
    }


}
