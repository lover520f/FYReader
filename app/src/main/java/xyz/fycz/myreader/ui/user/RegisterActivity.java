package xyz.fycz.myreader.ui.user;

/**
 * @author fengyue
 * @date 2020/4/26 18:49
 */

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.*;
import butterknife.BindView;
import butterknife.ButterKnife;
import xyz.fycz.myreader.R;
import xyz.fycz.myreader.base.BaseActivity;


@SuppressLint("Registered")
public class RegisterActivity extends BaseActivity{
    @BindView(R.id.ll_title_back)
    LinearLayout llTitleBack;
    @BindView(R.id.tv_title_text)
    TextView tvTitleText;
    @BindView(R.id.et_username)
    EditText etUsername;
    @BindView(R.id.et_password)
    EditText etPassword;
    @BindView(R.id.et_rp_password)
    EditText etRpPassword;
    @BindView(R.id.et_captcha)
    EditText etCaptcha;
    @BindView(R.id.iv_captcha)
    ImageView ivCaptcha;
    @BindView(R.id.bt_register)
    Button btRegister;
    @BindView(R.id.tv_register_tip)
    TextView tvRegisterTip;
    @BindView(R.id.cb_agreement)
    CheckBox cbAgreement;
    @BindView(R.id.tv_agreement)
    TextView tvAgreement;
    private RegisterPresenter mRegisterPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);
        setStatusBar(R.color.sys_line);
        mRegisterPresenter = new RegisterPresenter(this);
        mRegisterPresenter.start();
    }

    public LinearLayout getLlTitleBack() {
        return llTitleBack;
    }

    public TextView getTvTitleText() {
        return tvTitleText;
    }

    public EditText getEtUsername() {
        return etUsername;
    }

    public EditText getEtPassword() {
        return etPassword;
    }

    public EditText getEtRpPassword() {
        return etRpPassword;
    }

    public EditText getEtCaptcha() {
        return etCaptcha;
    }

    public ImageView getIvCaptcha() {
        return ivCaptcha;
    }

    public Button getBtRegister() {
        return btRegister;
    }

    public TextView getTvRegisterTip() {
        return tvRegisterTip;
    }

    public CheckBox getCbAgreement() {
        return cbAgreement;
    }

    public TextView getTvAgreement() {
        return tvAgreement;
    }
}