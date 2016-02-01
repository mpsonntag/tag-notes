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
                        Integer.toString(toParse.size()), "\n")
        );

        for (String currLine : toParse) {
            if (currLine.contains("(#)") & currLine.endsWith("#)")) {
                System.out.println("TagLine");
                System.out.println(currLine);

                retList.add(new TaggedEntity());
            } else {
                System.out.println("BodyLine");
                System.out.println(currLine);
            }
        }

        System.out.println(String.join("", "# of Tagged entities: ",
                Integer.toString(retList.size()))
        );

        return retList;
    }

}
