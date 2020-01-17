package com.thoughtbot.expandablerecyclerview.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

/**
 * The backing data object for an {@link ExpandableGroup}
 */
public class ExpandableGroup<T extends ExpandableChild> {
    private List<T> children;

    public ExpandableGroup(List<T> children) {
        this.children = children;
    }

    public List<T> getChildren() {
        return children;
    }

    public void setChildren(List<T> children) {
        this.children = children;
    }

    public int getItemCount() {
        return children == null ? 0 : children.size();
    }

    @Override
    public String toString() {
        return "ExpandableGroup{" +
                "children=" + children +
                '}';
    }

}
