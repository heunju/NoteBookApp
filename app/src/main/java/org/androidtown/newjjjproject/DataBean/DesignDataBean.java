package org.androidtown.newjjjproject.DataBean;

import android.widget.Button;

import java.io.Serializable;
import java.util.List;

public class DesignDataBean implements Serializable {

    private DesignDataBean designDataBean;
    private List<DesignDataBeanSub> designDataBeanSubList;

    private static class DesignDataBeanSub implements Serializable
    {
        private Button btn_design1;
        private Button btn_design2;
        private Button btn_design3;
        private Button btn_design4;
        private Button btn_design5;
        private Button btn_design6;

        public Button getBtn_design1() {
            return btn_design1;
        }

        public void setBtn_design1(Button btn_design1) {
            this.btn_design1 = btn_design1;
        }

        public Button getBtn_design2() {
            return btn_design2;
        }

        public void setBtn_design2(Button btn_design2) {
            this.btn_design2 = btn_design2;
        }

        public Button getBtn_design3() {
            return btn_design3;
        }

        public void setBtn_design3(Button btn_design3) {
            this.btn_design3 = btn_design3;
        }

        public Button getBtn_design4() {
            return btn_design4;
        }

        public void setBtn_design4(Button btn_design4) {
            this.btn_design4 = btn_design4;
        }

        public Button getBtn_design5() {
            return btn_design5;
        }

        public void setBtn_design5(Button btn_design5) {
            this.btn_design5 = btn_design5;
        }

        public Button getBtn_design6() {
            return btn_design6;
        }

        public void setBtn_design6(Button btn_design6) {
            this.btn_design6 = btn_design6;
        }
    }

    public DesignDataBean getDesignDataBean() {
        return designDataBean;
    }

    public void setDesignDataBean(DesignDataBean designDataBean) {
        this.designDataBean = designDataBean;
    }

    public List<DesignDataBeanSub> getDesignDataBeanSubList() {
        return designDataBeanSubList;
    }

    public void setDesignDataBeanSubList(List<DesignDataBeanSub> designDataBeanSubList) {
        this.designDataBeanSubList = designDataBeanSubList;
    }
}
