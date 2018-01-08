/*
Danh sách các loại thuốc: Mã thuốc, tên thuốc, nhà cung cấp, hướng dẫn sử dụng, …
 */
package pet.care.model;

/**
 *
 * @author nguye
 */
public class MedicineModel {
    private String id;
    private String name;
    private String price;
    private String hsd;
    private String effect;
    public MedicineModel() {
    }

    public MedicineModel(String id, String name, String price, String hsd, String effect) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.hsd = hsd;
        this.effect = effect;
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
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * @return the hsd
     */
    public String getHsd() {
        return hsd;
    }

    /**
     * @param hsd the hsd to set
     */
    public void setHsd(String hsd) {
        this.hsd = hsd;
    }

    /**
     * @return the effect
     */
    public String getEffect() {
        return effect;
    }

    /**
     * @param effect the effect to set
     */
    public void setEffect(String effect) {
        this.effect = effect;
    }

    
    
}
