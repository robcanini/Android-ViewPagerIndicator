package android.support.v4.view;

import android.database.DataSetObserver;


/**
 * Link class to all the {@link VerticalViewPager} to access protected methods within
 * {@link PagerAdapter}.
 * <p/>
 * This is to avoid the need to extend {@link PagerAdapter} as that is already extended by other
 * classes. It also avoids the need to put our full VerticalViewPager into the Android support
 * name space.
 */
public class VerticalViewPagerCompat {

    private VerticalViewPagerCompat() {
    }

    public static void registerDataSetObserver(PagerAdapter adapter, DataSetObserver observer) {
        adapter.registerDataSetObserver(observer);
    }

    public static void unregisterDataSetObserver(PagerAdapter adapter, DataSetObserver observer) {
        adapter.unregisterDataSetObserver(observer);
    }

}
