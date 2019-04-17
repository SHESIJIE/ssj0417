package shesijie.bawei.com.ssj0417.RecyleViewMvp;

public class RecycleViewPresenter implements RecycleViewContanst.IRePresenter {

    RecycleViewContanst.IReView iReView;
    RecycleViewModel model;

    @Override
    public void Model() {

    }

    @Override
    public void OnAttch(final RecycleViewContanst.IReView iReView) {
        this.iReView = iReView;
        model = new RecycleViewModel ();
        model.show ( new RecycleViewContanst.IReModel.ReModelCallBack () {
            @Override
            public void onSuccess(String data) {
                iReView.getPresenter ( data );
            }
            @Override
            public void onFail() {
            }
        } );

    }

    @Override
    public void OnDeach() {
        if (model != null) {
            model = null;
        }
        if (iReView != null) {
            iReView = null;
        }
        System.gc ();
    }
}
