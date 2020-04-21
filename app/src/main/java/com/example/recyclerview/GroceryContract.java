package com.example.recyclerview;

import android.provider.BaseColumns;

class GroceryContract {
    static final class GroceryEntry implements BaseColumns {
        static final String TABLE_NAME = "groceryList";
        static final String COLUMN_NAME = "name";
        static final String COLUMN_AMOUNT = "amount";
        static final String COLUMN_TIMESTAMP = "timestamp";
    }
}
