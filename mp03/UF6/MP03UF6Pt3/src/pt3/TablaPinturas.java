/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt3;

/**
 *
 * @author mirokshi
 */
public class TablaPinturas {

    int pictureId;
    String pictureName;
    int pictureDate;
    String pictureStyle;

    public TablaPinturas(int picture_id, String picture_name, int picture_date, String picture_style) {
        this.pictureId = picture_id;
        this.pictureName = picture_name;
        this.pictureDate = picture_date;
        this.pictureStyle = picture_style;
    }

    public TablaPinturas(String pictureName, int pictureDate, String pictureStyle) {
        this.pictureName = pictureName;
        this.pictureDate = pictureDate;
        this.pictureStyle = pictureStyle;
    }

    @Override
    public String toString() {
        return "TablaPinturas{" + "pictureId=" + pictureId + ", pictureName=" + pictureName + ", pictureDate=" + pictureDate + ", pictureStyle=" + pictureStyle + '}';
    }

}
