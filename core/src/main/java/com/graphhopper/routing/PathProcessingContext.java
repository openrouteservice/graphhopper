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
    private PathProcessor pathProcessor;

    public PathProcessingContext()
    {
        this(null);
    }

    public PathProcessingContext(PathProcessor pathProcessor) {
        this.pathProcessor = pathProcessor;
    }
}
