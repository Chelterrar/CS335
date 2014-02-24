package edu.uwec.cs.forstezt.hull;

import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.Comparator;

public class Point2DYComparator implements Comparator<Point2D> {
	
	public int compare(Point2D p1, Point2D p2){
		if (p1.getY() > p2.getY()){
			return 1;
		} else if (p1.getY() < p2.getY()) {
			return -1;
		} else {
			return 0;
		}
	}
	
}
