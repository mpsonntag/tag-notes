/**
 * Copyright (c) 2016, Michael Sonntag
 *
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted under the terms of the BSD License. See
 * LICENSE file in the root of the Project.
 */

package org.mps.lib;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Instances contain all information of a tagged entity.
 */
public class TaggedEntity {

    private String entityID;
    private List<String> tags;
    private String body;

    TaggedEntity() {
        this.entityID = UUID.randomUUID().toString();
        this.tags = new ArrayList<>();
        this.body = "";
    }

    TaggedEntity(String entityID) {
        this.entityID = entityID;
        this.tags = new ArrayList<>();
        this.body = "";
    }


    public String getEntityID() {
        return entityID;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
