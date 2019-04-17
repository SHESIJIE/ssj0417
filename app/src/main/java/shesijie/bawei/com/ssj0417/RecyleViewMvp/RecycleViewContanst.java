package shesijie.bawei.com.ssj0417.RecyleViewMvp;

public interface RecycleViewContanst {
    public interface IReView{
        void getPresenter(String data);
    }
    public interface IReModel{
        void show(IReModel.ReModelCallBack reModelCallBack);
        public interface ReModelCallBack{
            void  onSuccess(String data);
            void  onFail();
        }
    }
    public interface IRePresenter{
        void Model();
        void OnAttch(IReView iReView);
        void OnDeach();
    }
}
