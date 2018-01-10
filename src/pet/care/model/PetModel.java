/***
 * Danh sách thú cưng: Mã thú cưng, tên thú cưng, tên chủ nhân, giống, giới tính, màu lông, tuổi, tình
trạng bệnh.
 */

package pet.care.model;

/**
 *
 * @author nguye
 */
public class PetModel {
    
    private String id;
    private String name;
    private CustomerModel boss;
    private int sex;
    private int age;
    private String status;
    private static byte MALE = 1;
    private static byte FEMALE = 0;
    public PetModel() {
        
    }

    public PetModel(String id, String name, CustomerModel boss, int sex, int age, String status) {
        this.id = id;
        this.name = name;
        this.boss = boss;
        this.sex = sex;
        this.age = age;
        this.status = status;
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
     * @return the boss
     */
    public CustomerModel getBoss() {
        return boss;
    }

    /**
     * @param boss the boss to set
     */
    public void setBoss(CustomerModel boss) {
        this.boss = boss;
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
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the MALE
     */
    public static byte getMALE() {
        return MALE;
    }

    /**
     * @param aMALE the MALE to set
     */
    public static void setMALE(byte aMALE) {
        MALE = aMALE;
    }

    /**
     * @return the FEMALE
     */
    public static byte getFEMALE() {
        return FEMALE;
    }

    /**
     * @param aFEMALE the FEMALE to set
     */
    public static void setFEMALE(byte aFEMALE) {
        FEMALE = aFEMALE;
    }

   
}
