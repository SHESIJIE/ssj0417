package shesijie.bawei.com.ssj0417.mvp;

public interface Contaner {
    public interface IView{
        void getPresenter(String data);
    }
    public interface IModel{
        void show(IModel.ModelCallBack modelCallBack);
        public interface ModelCallBack{
            void onSuccess(String data);
            void onFail();
        }
    }
    public interface IPresenter{
        void getModel();
        void onAttch(IView iView);
        void onDeach();
    }
}
