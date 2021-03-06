package com.inovex.zabbixmobile.adapters;

import android.content.Context;

import com.inovex.zabbixmobile.activities.fragments.BaseSeverityFilterListPage;
import com.inovex.zabbixmobile.activities.fragments.EventsListPage;
import com.inovex.zabbixmobile.model.Event;

/**
 * Adapter for pages containing lists of events.
 * 
 */
public class EventsListPagerAdapter extends BaseSeverityListPagerAdapter<Event> {

	public EventsListPagerAdapter(Context context) {
		super(context);
	}

	@Override
	protected BaseSeverityFilterListPage<Event> instantiatePage() {
		return new EventsListPage();
	}

	@Override
	public Long getItemId(int position) {
		if (getObject(position) == null)
			return null;
		return (long) getObject(position).getNumber();
	}

}
