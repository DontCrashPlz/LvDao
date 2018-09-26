package com.lvdao.sail.lvdao.beans;

/**
 * 商品交易实体，包含商品交易数量和总价
 * Created by Zheng on 2018/9/4.
 */

public class GoodsDealEntity extends GoodsEntity {
    private float total_price;//总价格
    private float total_integral;//积分总价格
    private int count;//交易数量

    public float getTotal_price() {
        return total_price;
    }

    public void setTotal_price(float total_price) {
        this.total_price = total_price;
    }

    public float getTotal_integral() {
        return total_integral;
    }

    public void setTotal_integral(float total_integral) {
        this.total_integral = total_integral;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "GoodsDealEntity{" +
                "goods_id=" + getGoods_id() +
                ", total_price=" + total_price +
                ", goods_name='" + getGoods_name() + '\'' +
                ", total_integral=" + total_integral +
                ", goods_description='" + getGoods_description() + '\'' +
                ", count=" + count +
                ", goods_imgurl='" + getGoods_imgurl() + '\'' +
                ", goods_price=" + getGoods_price() +
                ", goods_integral=" + getGoods_integral() +
                ", goods_unit='" + getGoods_unit() + '\'' +
                '}';
    }
}
