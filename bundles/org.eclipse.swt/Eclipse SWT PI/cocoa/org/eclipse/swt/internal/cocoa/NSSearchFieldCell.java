/*******************************************************************************
 * Copyright (c) 2000, 2017 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.swt.internal.cocoa;

public class NSSearchFieldCell extends NSTextFieldCell {

public NSSearchFieldCell() {
	super();
}

public NSSearchFieldCell(long /*int*/ id) {
	super(id);
}

public NSSearchFieldCell(id id) {
	super(id);
}

public NSButtonCell cancelButtonCell() {
	long /*int*/ result = OS.objc_msgSend(this.id, OS.sel_cancelButtonCell);
	return result != 0 ? new NSButtonCell(result) : null;
}

public NSRect cancelButtonRectForBounds(NSRect rect) {
	NSRect result = new NSRect();
	OS.objc_msgSend_stret(result, this.id, OS.sel_cancelButtonRectForBounds_, rect);
	return result;
}

public NSButtonCell searchButtonCell() {
	long /*int*/ result = OS.objc_msgSend(this.id, OS.sel_searchButtonCell);
	return result != 0 ? new NSButtonCell(result) : null;
}

public NSRect searchButtonRectForBounds(NSRect rect) {
	NSRect result = new NSRect();
	OS.objc_msgSend_stret(result, this.id, OS.sel_searchButtonRectForBounds_, rect);
	return result;
}

public NSRect searchTextRectForBounds(NSRect rect) {
	NSRect result = new NSRect();
	OS.objc_msgSend_stret(result, this.id, OS.sel_searchTextRectForBounds_, rect);
	return result;
}

public void setCancelButtonCell(NSButtonCell cancelButtonCell) {
	OS.objc_msgSend(this.id, OS.sel_setCancelButtonCell_, cancelButtonCell != null ? cancelButtonCell.id : 0);
}

public void setSearchButtonCell(NSButtonCell searchButtonCell) {
	OS.objc_msgSend(this.id, OS.sel_setSearchButtonCell_, searchButtonCell != null ? searchButtonCell.id : 0);
}

}
