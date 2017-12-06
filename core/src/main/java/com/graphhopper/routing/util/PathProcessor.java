package com.graphhopper.routing.util;

import com.graphhopper.routing.PathProcessingContext;
import com.graphhopper.util.EdgeIteratorState;
import com.graphhopper.util.PointList;

/**
 * Class that allows the collection of multiple pieces of information for each segment of a route (i.e. surface type,
 * steepness).
 * The class is predominantly used inbetween the returning of a route from graphhopper and providing the results to the
 * user and utilises the extended storages which contain custom graphs.
 * The path processor object itself is passed through a PathProcessingContext object
 */
public abstract class PathProcessor {
    public abstract void init(PathProcessingContext cntx);
    public abstract void setSegmentIndex(int index, int count);
    public abstract void processEdge(int pathIndex, EdgeIteratorState edge, boolean lastEdge, PointList geom);
    public abstract void finish();
    public abstract PointList processPoints(PointList points);
}
