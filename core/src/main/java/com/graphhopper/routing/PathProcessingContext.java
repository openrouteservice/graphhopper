package com.graphhopper.routing;

import com.graphhopper.routing.util.FlagEncoder;
import com.graphhopper.routing.util.PathProcessor;
import com.graphhopper.routing.weighting.Weighting;
import com.graphhopper.util.Translation;

/**
 * An object that contains information about additional data that is used for providing a suitable response to the
 * user. Predominantly it is used to transfer customised information from the object making the request and filter it
 * through the route generation process
 */
public class PathProcessingContext {
    private PathProcessor _pathProcessor;
    private Translation _translation;
    private int _pathIndex = 0;

    public PathProcessingContext(Translation tr)
    {
        this(tr,null);
    }

    public PathProcessingContext(Translation tr, PathProcessor pathProcessor) {
        this._translation = tr;
        this._pathProcessor = pathProcessor;
    }

    public PathProcessor getPathProcessor() { return _pathProcessor; }

    public Translation getTranslation() { return _translation; }

    public int getPathIndex() { return _pathIndex; }

    public void setPathIndex(int pathIndex) { this._pathIndex = pathIndex; }
}
