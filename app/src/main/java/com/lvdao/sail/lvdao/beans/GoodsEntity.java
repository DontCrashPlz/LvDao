package com.lvdao.sail.lvdao.beans;

/**
 * 商品实体，商品的最基本信息
 * Created by Zheng on 2018/9/4.
 */

public class GoodsEntity {
    private int goods_id;//商品id
    private String goods_name;//商品名称
    private String goods_description;//商品描述
    private String goods_imgurl;//商品图片
    private float goods_price;//商品价格
    private float goods_integral;//商品积分价格
    private String goods_unit;//商品单位

    public int getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(int goods_id) {
        this.goods_id = goods_id;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public String getGoods_description() {
        return goods_description;
    }

    public void setGoods_description(String goods_description) {
        this.goods_description = goods_description;
    }

    public String getGoods_imgurl() {
        return goods_imgurl;
    }

    public void setGoods_imgurl(String goods_imgurl) {
        this.goods_imgurl = goods_imgurl;
    }

    public float getGoods_price() {
        return goods_price;
    }

    public void setGoods_price(float goods_price) {
        this.goods_price = goods_price;
    }

    public float getGoods_integral() {
        return goods_integral;
    }

    public void setGoods_integral(float goods_integral) {
        this.goods_integral = goods_integral;
    }

    public String getGoods_unit() {
        return goods_unit;
    }

    public void setGoods_unit(String goods_unit) {
        this.goods_unit = goods_unit;
    }

    @Override
    public String toString() {
        return "GoodsEntity{" +
                "goods_id=" + goods_id +
                ", goods_name='" + goods_name + '\'' +
                ", goods_description='" + goods_description + '\'' +
                ", goods_imgurl='" + goods_imgurl + '\'' +
                ", goods_price=" + goods_price +
                ", goods_integral=" + goods_integral +
                ", goods_unit='" + goods_unit + '\'' +
                '}';
    }
}
