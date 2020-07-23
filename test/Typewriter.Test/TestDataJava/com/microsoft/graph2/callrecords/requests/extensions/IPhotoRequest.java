// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph2.callrecords.requests.extensions;
import com.microsoft.graph2.callrecords.models.extensions.Photo;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Photo Request.
 */
public interface IPhotoRequest extends IHttpRequest {

    /**
     * Gets the Photo from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<Photo> callback);

    /**
     * Gets the Photo from the service
     *
     * @return the Photo from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Photo get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<Photo> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Photo with a source
     *
     * @param sourcePhoto the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Photo sourcePhoto, final ICallback<Photo> callback);

    /**
     * Patches this Photo with a source
     *
     * @param sourcePhoto the source object with updates
     * @return the updated Photo
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Photo patch(final Photo sourcePhoto) throws ClientException;

    /**
     * Posts a Photo with a new object
     *
     * @param newPhoto the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Photo newPhoto, final ICallback<Photo> callback);

    /**
     * Posts a Photo with a new object
     *
     * @param newPhoto the new object to create
     * @return the created Photo
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Photo post(final Photo newPhoto) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IPhotoRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IPhotoRequest expand(final String value);

}

