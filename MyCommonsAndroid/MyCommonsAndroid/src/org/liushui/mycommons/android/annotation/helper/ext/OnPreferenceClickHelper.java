package org.liushui.mycommons.android.annotation.helper.ext;

import java.lang.reflect.Field;

import org.liushui.mycommons.android.annotation.OnPreferenceChange;
import org.liushui.mycommons.android.annotation.helper.BaseHelper;

import android.view.View;

public class OnPreferenceClickHelper extends BaseHelper<OnPreferenceChange>
{

	public OnPreferenceClickHelper(Object obj, View container)
	{
		super(obj, container);
	}

	public void doHelp(OnPreferenceChange t, Field field, String fieldName, Object fieldValue)
	{

	}
}
