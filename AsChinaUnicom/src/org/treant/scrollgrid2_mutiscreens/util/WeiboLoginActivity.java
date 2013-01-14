package org.treant.scrollgrid2_mutiscreens.util;

import org.treant.scrollgrid2_mutiscreens.R;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.RelativeLayout;

public class WeiboLoginActivity extends Activity {


	ProgressDialog progressDialog;
	SharedPreferences sp_user;

	Button log_button,btn_back;RelativeLayout relate;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_login);
		}
//		relate.setOnClickListener(new OnClickListener() {
//
//			@Override
//			public void onClick(View v) {
//				// TODO Auto-generated method stub
//				if (Configure.N_USER_NAME ==null ||Configure.N_USER_NAME.equals("")) {
//					progressDialog = ProgressDialog.show(UserCenterActivity.this,
//							"请稍等片刻...", "马上为您准备登录", true, true);
//					new Thread() {
//						public void run() {
//
//							System.setProperty("weibo4j.oauth.consumerKey",
//									Weibo.CONSUMER_KEY);
//							System.setProperty("weibo4j.oauth.consumerSecret",
//									Weibo.CONSUMER_SECRET);
//							String authUrl =null;
//							Weibo weibo = new Weibo();
//							RequestToken requestToken;
//							try {
//								requestToken = weibo
//										.getOAuthRequestToken("life://LoginActivity");
//								OAuthConstantBean.getInstance()
//										.setRequestToken(requestToken);
//								authUrl = requestToken
//										.getAuthenticationURL()
//										+ "&display=mobile";
//							
//							} catch (WeiboException e) {
//								e.printStackTrace();
//							}
//							Message msg = loginHandler.obtainMessage();
//							msg.obj=authUrl;
//							loginHandler.sendMessage(msg);
//						}
//					}.start();
//				} else {
//					sp_user.edit().clear().commit();
//					Configure.userRegister();
//					Toast.makeText(getApplicationContext(), "注销成功",
//							Toast.LENGTH_SHORT).show();
//					log_button.setText("登录");
//					log_button.setTextColor(Color.WHITE);
//					log_button
//							.setBackgroundResource(R.drawable.more_userset_register);
//					u_name.setText("新浪微博");
//				}
//			}
//		});
//	}
//	Handler loginHandler = new Handler() {
//		public void handleMessage(Message msg) {
//			progressDialog.dismiss();
//			Intent intent = new Intent();
//			Bundle bundle = new Bundle();
//			bundle.putString("url",(String) msg.obj);
//			intent.putExtras(bundle);
//			intent.setClass(UserCenterActivity.this,
//					UserLoginActivity.class);
//			startActivity(intent);
//		}
//	};

	// 退出
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			finish();
			overridePendingTransition(R.anim.anim_fromleft_toup6, R.anim.anim_down_toright6);
			return false;
		}
		return false;
	}
//	Handler UIHandler = new Handler() {
//		public void handleMessage(Message msg) {
//			progressDialog.dismiss();
//			if (Configure.N_USER_NAME !=null && !Configure.N_USER_NAME.equals("")) {
//				log_button.setText("注销");
//				log_button.setTextColor(Color.GRAY);
//				log_button.setBackgroundResource(R.drawable.more_userset_login);
//				u_name.setText(Configure.N_USER_NAME);
//			}
//		}
//	};

//	@Override
//	protected void onNewIntent(final Intent intent) {
//		progressDialog = ProgressDialog.show(UserCenterActivity.this,
//				"请稍等片刻...", "授权验证中，马上为您跳转", true, true);
//		new Thread() {
//			public void run() {
//				try {
//					Uri uri = intent.getData();
//					if (uri == null) {
//						return;
//					}
//					Weibo weibo = OAuthConstantBean.getInstance().getWeibo();
//					RequestToken requestToken = OAuthConstantBean.getInstance()
//							.getRequestToken();
//					String nulls = uri.getQueryParameter("oauth_verifier");
//					if (nulls != null) {
//						AccessToken accessToken = requestToken
//								.getAccessToken(nulls);
//						weibo.setToken(accessToken.getToken(),
//								accessToken.getTokenSecret());
//
//						List<weibo4android.Status> statuses = null;
//
//						statuses = weibo.getUserTimeline();
//						// statuses = weibo.get
//						if (statuses.size() != 0) {
//							SharedPreferences refreshtime = getSharedPreferences(
//									"sp_users", 0);
//							refreshtime.edit().putLong("UserId",accessToken.getUserId()).commit();
//							refreshtime.edit().putString("UserName",statuses.get(0).getUser().getName()).commit();
//							refreshtime.edit().putString("Token", accessToken.getToken()).commit();
//							refreshtime.edit().putString("TokenSecret",accessToken.getTokenSecret()).commit();
//							Configure.setUserWeibo(accessToken.getUserId(),statuses.get(0).getUser().getName(),accessToken.getToken(),accessToken.getTokenSecret());
//						} else {
//							Toast.makeText(getApplicationContext(), "授权失败,请重试",
//									Toast.LENGTH_LONG).show();
//						}
//					}
//				} catch (WeiboException e) {
//					// TODO: handle exception
//					e.printStackTrace();
//				}
//				Message msg = UIHandler.obtainMessage();
//				UIHandler.sendMessage(msg);
//			}
//		}.start();
//
//	}
}
