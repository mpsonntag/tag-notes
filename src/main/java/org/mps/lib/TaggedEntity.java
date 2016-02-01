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
 * Prototype class.
 * Instances contain all information of a tagged entity.
 */
public final class TaggedEntity {
    /**
     * String to identify the entity. Default constructor creates a new UUID as entityID.
     */
    private String entityID;
    /**
     * Tags associated with the tagged entity.
     */
    private List<String> tags;
    /**
     * Main content of the tagged entity.
     */
    private String body;
    /**
     * Default constructor of the TaggedEntity.
     */
    TaggedEntity() {
        this.entityID = UUID.randomUUID().toString();
        this.tags = new ArrayList<>();
        this.body = "";
    }
    /**
     * Constructor of a TaggedEntity, initializing it with a given ID.
     * @param inEntityID ID used to initialize the ID attribute of the instance.
     */
    TaggedEntity(final String inEntityID) {
        this.entityID = inEntityID;
        this.tags = new ArrayList<>();
        this.body = "";
    }
    /**
     * Get the ID String associated with this tagged entity.
     * @return See description.
     */
    public String getEntityID() {
        return this.entityID;
    }
    /**
     * Get all tags assigned to this tagged entity.
     * @return List of Strings corresponding to the tags associated with this entity.
     */
    public List<String> getTags() {
        return this.tags;
    }
    /**
     * Get the main text of the tagged entity.
     * @return See description.
     */
    public String getBody() {
        return this.body;
    }
    /**
     * Set the main text of the tagged entity.
     * @param inBody String containing the current main text of the tagged entity.
     */
    public void setBody(final String inBody) {
        this.body = inBody;
    }
}
