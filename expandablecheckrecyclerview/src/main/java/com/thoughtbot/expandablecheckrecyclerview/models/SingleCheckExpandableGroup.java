package com.thoughtbot.expandablecheckrecyclerview.models;

import android.os.Parcel;
import java.util.List;

/**
 * A subclass of {@link CheckedExpandableGroup} that allows for only *one* child to be checked at
 * one time
 */
public class SingleCheckExpandableGroup extends CheckedExpandableGroup {

  public SingleCheckExpandableGroup(String title, List items) {
    super(title, items);
  }

  @Override
  public void onChildClicked(int childIndex, boolean checked) {
    if (checked) {
      for (int i = 0; i < getItemCount(); i++) {
        unCheckChild(i);
      }
      checkChild(childIndex);
    }
  }
}
