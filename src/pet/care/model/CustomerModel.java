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
    private String sex;
    private int citizenId;
    private String address;
    private String phone;
    private String email;
    private PetModel pet;

    public CustomerModel() {
    }

    public CustomerModel(String id, String name, String sex, int citizenId, String address, String phone, String email, PetModel pet) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.citizenId = citizenId;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.pet = pet;
    }

    
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

    public int getCitizenId() {
        return citizenId;
    }

    public void setCitizenId(int citizenId) {
        this.citizenId = citizenId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the pet
     */
    public PetModel getPet() {
        return pet;
    }

    /**
     * @param pet the pet to set
     */
    public void setPet(PetModel pet) {
        this.pet = pet;
    }

    /**
     * @return the sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

}
