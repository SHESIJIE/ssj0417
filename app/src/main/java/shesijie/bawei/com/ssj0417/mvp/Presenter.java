package shesijie.bawei.com.ssj0417.mvp;

public class Presenter implements Contaner.IPresenter {
    Contaner.IView iView;
    Model model;

    @Override
    public void getModel() {

    }

    @Override
    public void onAttch(final Contaner.IView iView) {
        model = new Model ();
        this.iView = iView;
        model.show ( new Contaner.IModel.ModelCallBack () {
            @Override
            public void onSuccess(String data) {
                iView.getPresenter ( data );
            }

            @Override
            public void onFail() {

            }
        } );
    }

    @Override
    public void onDeach() {
        if (model != null) {
            model = null;
        }
        if (iView != null) {
            iView =  null;
        }
        System.gc ();
    }
}
