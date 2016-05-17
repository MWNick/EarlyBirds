package com.mans.earlybirds;

/**
 * Created by Mans on 2016-05-17.
 */
public class Sample {
}
/*


public class MainActivity extends FragmentActivity {
    public static final int LOGIN_REQUEST = 1;

    private PagerSlidingTabStrip mPagerStrip;
    private ViewPager mViewPager;
    private Typeface typeface;
    private FragmentManager fm;

    private SectionsPagerAdapter mSectionPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionbar = getActionBar();
        setContentView(R.layout.activity_main);

        //Create Typeface instance
        typeface = Typeface.createFromAsset(getApplicationContext().getAssets(), "EligibleSans-Bold.ttf");

        //Set up action bar
        actionbar.setTitle(R.string.app_title);
        actionbar.setIcon(R.drawable.bird);

        //Create adapter
        fm = getSupportFragmentManager();
        mPagerStrip = (PagerSlidingTabStrip)findViewById(R.id.pager_title_strip);
        mViewPager = (ViewPager)findViewById(R.id.pager);
        mSectionPagerAdapter = new SectionsPagerAdapter(fm);

        //Set up ViewPager with SectionPagerAdapter
        mViewPager.setAdapter(mSectionPagerAdapter);
        mPagerStrip.setViewPager(mViewPager);
        mPagerStrip.setShouldExpand(false);

        getLogin();
    }

    private void getLogin(){
        SharedPreferences pref = getSharedPreferences("login_info", MODE_PRIVATE);
        String id = pref.getString("user_id", "#NOID");

        if(id.equals("#NOID")){
            //if not login intent login page
            Intent intent = new Intent(this, LoginPage.class);
            startActivityForResult(intent, LOGIN_REQUEST);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == LOGIN_REQUEST){
            switch(resultCode){
                case LoginPage.RESULT_OK :
                    Log.i("MAIN", "Login ok");
                    break;
                case LoginPage.RESULT_ERR :
                    Log.i("MAIN", "Login failed");
                    finish();
                    break;
                default:
                    finish();
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}*/
