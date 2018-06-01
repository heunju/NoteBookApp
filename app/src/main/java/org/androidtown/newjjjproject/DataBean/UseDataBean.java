package org.androidtown.newjjjproject.DataBean;

import android.widget.Button;

import java.io.Serializable;
import java.util.List;

public class UseDataBean implements Serializable{

    private UseDataBean useDataBean;
    private List<UseDataBeanSub> useDataBeanList;

    public static class UseDataBeanSub implements Serializable
    {
        private Button btn_use1;
        private Button btn_use2;
        private Button btn_use3;
        private Button btn_use4;
        private Button btn_use5;

        public Button getBtn_use1() {
            return btn_use1;
        }

        public void setBtn_use1(Button btn_use1) {
            this.btn_use1 = btn_use1;
        }

        public Button getBtn_use2() {
            return btn_use2;
        }

        public void setBtn_use2(Button btn_use2) {
            this.btn_use2 = btn_use2;
        }

        public Button getBtn_use3() {
            return btn_use3;
        }

        public void setBtn_use3(Button btn_use3) {
            this.btn_use3 = btn_use3;
        }

        public Button getBtn_use4() {
            return btn_use4;
        }

        public void setBtn_use4(Button btn_use4) {
            this.btn_use4 = btn_use4;
        }

        public Button getBtn_use5() {
            return btn_use5;
        }

        public void setBtn_use5(Button btn_use5) {
            this.btn_use5 = btn_use5;
        }
    }

    public UseDataBean getUseDataBean() {
        return useDataBean;
    }

    public void setUseDataBean(UseDataBean useDataBean) {
        this.useDataBean = useDataBean;
    }

    public List<UseDataBeanSub> getUseDataBeanList() {
        return useDataBeanList;
    }

    public void setUseDataBeanList(List<UseDataBeanSub> useDataBeanList) {
        this.useDataBeanList = useDataBeanList;
    }
}
