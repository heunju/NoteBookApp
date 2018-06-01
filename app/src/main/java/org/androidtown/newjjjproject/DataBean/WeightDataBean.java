package org.androidtown.newjjjproject.DataBean;

import android.widget.Button;

import java.io.Serializable;
import java.util.List;

public class WeightDataBean implements Serializable{

    private WeightDataBean weightDataBean;
    private List<WeightDataBeanSub> weightDataBeanSubList;

    private static class WeightDataBeanSub implements Serializable
    {
        private Button btn_weight1;
        private Button btn_weight2;
        private Button btn_weight3;
        private Button btn_weight4;
        private Button btn_weight5;
        private Button btn_weight6;

        public Button getBtn_weight1() {
            return btn_weight1;
        }

        public void setBtn_weight1(Button btn_weight1) {
            this.btn_weight1 = btn_weight1;
        }

        public Button getBtn_weight2() {
            return btn_weight2;
        }

        public void setBtn_weight2(Button btn_weight2) {
            this.btn_weight2 = btn_weight2;
        }

        public Button getBtn_weight3() {
            return btn_weight3;
        }

        public void setBtn_weight3(Button btn_weight3) {
            this.btn_weight3 = btn_weight3;
        }

        public Button getBtn_weight4() {
            return btn_weight4;
        }

        public void setBtn_weight4(Button btn_weight4) {
            this.btn_weight4 = btn_weight4;
        }

        public Button getBtn_weight5() {
            return btn_weight5;
        }

        public void setBtn_weight5(Button btn_weight5) {
            this.btn_weight5 = btn_weight5;
        }

        public Button getBtn_weight6() {
            return btn_weight6;
        }

        public void setBtn_weight6(Button btn_weight6) {
            this.btn_weight6 = btn_weight6;
        }
    }


    public WeightDataBean getWeightDataBean() {
        return weightDataBean;
    }

    public void setWeightDataBean(WeightDataBean weightDataBean) {
        this.weightDataBean = weightDataBean;
    }

    public List<WeightDataBeanSub> getWeightDataBeanSubList() {
        return weightDataBeanSubList;
    }

    public void setWeightDataBeanSubList(List<WeightDataBeanSub> weightDataBeanSubList) {
        this.weightDataBeanSubList = weightDataBeanSubList;
    }
}
