/**
 * Copyright (c) 2016, Michael Sonntag
 *
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted under the terms of the BSD License. See
 * LICENSE file in the root of the Project.
 */

package lib;

import java.util.ArrayList;
import java.util.List;

/**
 * Parse list of Strings to a List of tagged entities.
 */
public final class ParseList {

    public static List<TaggedEntity> parseStringList(final List<String> toParse) {

        List<TaggedEntity> retList = new ArrayList<>();
        System.out.println(
                String.join("", "List has a length of: ",
                        Integer.toString(toParse.size()))
        );
        return retList;
    }

}
