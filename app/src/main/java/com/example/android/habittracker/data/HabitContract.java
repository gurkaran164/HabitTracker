package com.example.android.habittracker.data;

import android.provider.BaseColumns;

/**
 * Created by gurkaran on 26-02-2017.
 */

public final class HabitContract {
    private HabitContract(){  };

    public static final class HabitEntry implements BaseColumns {

        public final static String TABLE_NAME="habit";
        public final static String _ID=BaseColumns._ID;
        public final static String COLUMN_HABIT_NAME="name";
        public final static String COLUMN_HABIT_FREQUENCY="frequency";
    }
}
