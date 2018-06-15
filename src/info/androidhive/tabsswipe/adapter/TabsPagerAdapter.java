package info.androidhive.tabsswipe.adapter;
 






import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter; 

public class TabsPagerAdapter extends FragmentPagerAdapter {
 
    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }
 
    @Override
    public Fragment getItem(int index) {
 
        switch (index) {
        case 0:
            // Home fragment activity
            return new com.example.weddingorganizer.Fragment_home();
        case 1:
            // Vendor fragment activity
            return new com.example.weddingorganizer.Fragment_Vendor();
        case 2:
            // Budget fragment activity
            return new com.example.weddingorganizer.Fragment_Budget();
        case 3:
        	// Guest list fragment activity
        	return new com.example.weddingorganizer.Fragment_Guest();
        case 4:
        	// Left over fragment activity
        	return new com.example.weddingorganizer.Fragment_Leftover();
        case 5:
        	// Make cards fragment activity
        	return new com.example.weddingorganizer.Fragment_Cards();
        }
 
        return null;
    }
 
    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 6;
    }
 
}