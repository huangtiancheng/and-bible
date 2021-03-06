package net.bible.android.view.activity.page.actionbar;

import net.bible.android.control.ControlFactory;
import net.bible.android.view.activity.base.actionbar.QuickDocumentChangeToolbarButton;

import org.crosswire.jsword.book.Book;

/** Quick change bible toolbar button
 * 
 * @author Martin Denham [mjdenham at gmail dot com]
 * @see gnu.lgpl.License for license details.<br>
 *      The copyright to this program is held by it's author.
 */
public class BibleActionBarButton extends QuickDocumentChangeToolbarButton {

	@Override
	protected Book getSuggestedDocument() {
		return ControlFactory.getInstance().getDocumentControl().getSuggestedBible();
	}
}
