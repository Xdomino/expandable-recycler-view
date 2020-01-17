package com.thoughtbot.expandablecheckrecyclerview.models;

import android.os.Parcel;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;
import java.util.Arrays;
import java.util.List;

/**
 * An extension of ExpandableGroup that holds onto the checked state of it's children
 */
public abstract class CheckedExpandableGroup extends ExpandableGroup {

  public boolean[] selectedChildren;

  public CheckedExpandableGroup(String title, List items) {
    super(title, items);
    selectedChildren = new boolean[items.size()];
    for (int i = 0; i < items.size(); i++) {
      selectedChildren[i] = false;
    }
  }

  public void checkChild(int childIndex) {
    selectedChildren[childIndex] = true;
  }

  public void unCheckChild(int childIndex) {
    selectedChildren[childIndex] = false;
  }

  public boolean isChildChecked(int childIndex) {
    return selectedChildren[childIndex];
  }

  public void clearSelections() {
    if (selectedChildren != null) {
      Arrays.fill(selectedChildren, false);
    }
  }

  public abstract void onChildClicked(int childIndex, boolean checked);

}
