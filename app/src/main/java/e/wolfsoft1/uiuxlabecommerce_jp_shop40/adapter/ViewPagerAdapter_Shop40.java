package e.wolfsoft1.uiuxlabecommerce_jp_shop40.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import e.wolfsoft1.uiuxlabecommerce_jp_shop40.fragment.FragmentViewpagerShop40;


public class ViewPagerAdapter_Shop40 extends FragmentPagerAdapter {
    public ViewPagerAdapter_Shop40(FragmentManager fm, int i) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment = null;
        switch (i) {
            case 0:
                fragment = new FragmentViewpagerShop40();
                break;
            case 1:
                fragment = new FragmentViewpagerShop40();
                break;
            case 2:
                fragment = new FragmentViewpagerShop40();
                break;

        }

        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
