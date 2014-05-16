package com.lawrence.package1;

public interface Series {
	int getNext();
	void restart();
	void setStart(int index);
	int OUT_OF_BOUNDARY = -1;
}
