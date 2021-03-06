package com.TeamCCC.ftpchatclient;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.TeamCCC.ftpchatclient.dummy.DummyContent;

/**
 * A fragment representing a single Screen detail screen. This fragment is
 * either contained in a {@link ScreenListActivity} in two-pane mode (on
 * tablets) or a {@link ScreenDetailActivity} on handsets.
 */
public class ScreenDetailFragment extends Fragment {
	/**
	 * The fragment argument representing the item ID that this fragment
	 * represents.
	 */
	public static final String ARG_ITEM_ID = "item_id";
	public static int REQUEST_SAVE = 0;
	public View rootView;

	/**
	 * The dummy content this fragment is presenting.
	 */
	private DummyContent.DummyItem mItem;

	/**
	 * Mandatory empty constructor for the fragment manager to instantiate the
	 * fragment (e.g. upon screen orientation changes).
	 */
	public ScreenDetailFragment() {
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		if (getArguments().containsKey(ARG_ITEM_ID)) {
			// Load the dummy content specified by the fragment
			// arguments. In a real-world scenario, use a Loader
			// to load content from a content provider.
			mItem = DummyContent.ITEM_MAP.get(getArguments().getString(
					ARG_ITEM_ID));
		}
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		if (mItem.id == "3") {
			Intent intent = new Intent(getActivity(), FileDialog.class);
            //intent.putExtra(FileDialog.START_PATH, "/sdcard");
            
            //can user select directories or not
            //intent.putExtra(FileDialog.CAN_SELECT_DIR, true);
            
            //alternatively you can set file filter
            //intent.putExtra(FileDialog.FORMAT_FILTER, new String[] { "png" });
			
			rootView = inflater.inflate(R.layout.file_send_fragment_screen_detail,
    				container, false);
			
			intent.putExtra(FileDialog.SELECTION_MODE, SelectionMode.MODE_OPEN);
            
            startActivityForResult(intent, 1);
            
            
            
            
		}
		
		else{
			
			rootView = inflater.inflate(R.layout.file_send_fragment_screen_detail,
    				container, false);
	
			// Show the dummy content as text in a TextView.
			if (mItem != null) {
				((TextView) rootView.findViewById(R.id.textViewNameSend))
					.setText(mItem.name);
			}
			
		}
		
		return rootView;
	}
	
	public void onActivityResult(int requestCode, int resultCode,
            Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            if (resultCode == Activity.RESULT_OK) {
            	String Path = data.getStringExtra(FileDialog.RESULT_PATH);
            	((TextView) rootView.findViewById(R.id.textViewFileSend))
    			.setText(Path);
            }
        }
    }
}
