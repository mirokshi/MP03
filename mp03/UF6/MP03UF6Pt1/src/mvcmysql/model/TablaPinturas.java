/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcmysql.model;

/**
 *
 * @author mirokshi
 */
public class TablaPinturas {
    private int _1_Id;
    private String _2_pictureName;
    private String _3_pictureDate;

    public TablaPinturas(int picture_id, String picture_name, String picture_date) {
        this._1_Id = picture_id;
        this._2_pictureName = picture_name;
        this._3_pictureDate = picture_date;
    }

    public int get1_Id() {
        return _1_Id;
    }

    public void set1_Id(int _1_Id) {
        this._1_Id = _1_Id;
    }

    public TablaPinturas(String picture_name, String picture_date) {
        this._2_pictureName = picture_name;
        this._3_pictureDate = picture_date;
    }

    public String get3_pictureDate() {
        return _3_pictureDate;
    }

    public void set3_pictureDate(String _3_pictureDate) {
        this._3_pictureDate = _3_pictureDate;
    }
 
    public String get2_pictureName() {
        return _2_pictureName;
    }

    public void set2_pictureName(String _2_pictureName) {
        this._2_pictureName = _2_pictureName;
    }

}
