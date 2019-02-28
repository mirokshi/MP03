/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt4;

/**
 *
 * @author mirokshi
 */
public class Pinturas {

    private int pictureId;
    private String pictureName;
    private int pictureDate;
    private String pictureStyle;
    //Variable que asocian a la clase a un pintor
    private Pintor pintor;

    //Obreros
    public Pinturas() { 
    }

    public Pinturas(int pictureId, String pictureName, int pictureDate, String pictureStyle, Pintor pintor) {
        this.pictureId = pictureId;
        this.pictureName = pictureName;
        this.pictureDate = pictureDate;
        this.pictureStyle = pictureStyle;
        this.pintor = pintor;
    }
    
    

    public Pinturas(int picture_id, String picture_name, int picture_date, String picture_style) {
        this.pictureId = picture_id;
        this.pictureName = picture_name;
        this.pictureDate = picture_date;
        this.pictureStyle = picture_style;
    }

    public Pinturas(String pictureName, int pictureDate, String pictureStyle) {
        this.pictureName = pictureName;
        this.pictureDate = pictureDate;
        this.pictureStyle = pictureStyle;
    }

    @Override
    public String toString() {
        return "\nPinturas{" + "pictureId=" + pictureId + ", pictureName=" + pictureName + ", pictureDate=" + pictureDate + ", pictureStyle=" + pictureStyle + ", pintor=" + pintor + "}\n";
    }

    

    public int getPictureId() {
        return pictureId;
    }

    public void setPictureId(int pictureId) {
        this.pictureId = pictureId;
    }

    public String getPictureName() {
        return pictureName;
    }

    public void setPictureName(String pictureName) {
        this.pictureName = pictureName;
    }

    public int getPictureDate() {
        return pictureDate;
    }

    public void setPictureDate(int pictureDate) {
        this.pictureDate = pictureDate;
    }

    public String getPictureStyle() {
        return pictureStyle;
    }

    public void setPictureStyle(String pictureStyle) {
        this.pictureStyle = pictureStyle;
    }

    public Pintor getPintor() {
        return pintor;
    }

    public void setPintor(Pintor pintor) {
        this.pintor = pintor;
    }

}
