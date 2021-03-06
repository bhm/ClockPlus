package com.philliphsu.clock2.timepickers;

import android.content.Context;

import com.philliphsu.clock2.R;

/**
 * Created by Phillip Hsu on 8/17/2016.
 */
public class HoursGrid extends NumbersGrid {

    public HoursGrid(Context context) {
        super(context);
    }

    @Override
    public void setSelection(int value) {
        super.setSelection(value);
        // We expect value to be within [1, 12]. The position in the grid where
        // value is located is thus (value - 1).
        setIndicator(getChildAt(value - 1));
    }

    @Override
    protected int contentLayout() {
        return R.layout.content_hours_grid;
    }

    @Override
    protected int indexOfDefaultValue() {
        // This is the index of number 12.
        return getChildCount() - 1;
    }
}
