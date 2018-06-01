package org.androidtown.newjjjproject.DataBean;

import android.widget.Button;

import java.io.Serializable;
import java.util.List;

public class PriceDataBean implements Serializable {

    private PriceDataBean priceDataBean;
    private List<PriceDataBeanSub> priceDataBeanSubList;


    public static class PriceDataBeanSub implements Serializable
    {
        private Button btn_price1;
        private Button btn_price2;
        private Button btn_price3;
        private Button btn_price4;
        private Button btn_price5;
        private Button btn_price6;

        public Button getBtn_price1() {
            return btn_price1;
        }

        public void setBtn_price1(Button btn_price1) {
            this.btn_price1 = btn_price1;
        }

        public Button getBtn_price2() {
            return btn_price2;
        }

        public void setBtn_price2(Button btn_price2) {
            this.btn_price2 = btn_price2;
        }

        public Button getBtn_price3() {
            return btn_price3;
        }

        public void setBtn_price3(Button btn_price3) {
            this.btn_price3 = btn_price3;
        }

        public Button getBtn_price4() {
            return btn_price4;
        }

        public void setBtn_price4(Button btn_price4) {
            this.btn_price4 = btn_price4;
        }

        public Button getBtn_price5() {
            return btn_price5;
        }

        public void setBtn_price5(Button btn_price5) {
            this.btn_price5 = btn_price5;
        }

        public Button getBtn_price6() {
            return btn_price6;
        }

        public void setBtn_price6(Button btn_price6) {
            this.btn_price6 = btn_price6;
        }
    }

    public PriceDataBean getPriceDataBean() {
        return priceDataBean;
    }

    public void setPriceDataBean(PriceDataBean priceDataBean) {
        this.priceDataBean = priceDataBean;
    }

    public List<PriceDataBeanSub> getPriceDataBeanSubList() {
        return priceDataBeanSubList;
    }

    public void setPriceDataBeanSubList(List<PriceDataBeanSub> priceDataBeanSubList) {
        this.priceDataBeanSubList = priceDataBeanSubList;
    }
}
