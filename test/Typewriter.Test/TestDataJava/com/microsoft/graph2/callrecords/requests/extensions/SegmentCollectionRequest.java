// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph2.callrecords.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph2.callrecords.models.extensions.*;
import com.microsoft.graph2.callrecords.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph2.callrecords.requests.extensions.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Segment Collection Request.
 */
public class SegmentCollectionRequest extends BaseCollectionRequest<SegmentCollectionResponse, ISegmentCollectionPage> implements ISegmentCollectionRequest {

    /**
     * The request builder for this collection of Segment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SegmentCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SegmentCollectionResponse.class, ISegmentCollectionPage.class);
    }

    public void get(final ICallback<ISegmentCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public ISegmentCollectionPage get() throws ClientException {
        final SegmentCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final Segment newSegment, final ICallback<Segment> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new SegmentRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newSegment, callback);
    }

    public Segment post(final Segment newSegment) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new SegmentRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newSegment);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ISegmentCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (SegmentCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ISegmentCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (SegmentCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ISegmentCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (SegmentCollectionRequest)this;
    }

    public ISegmentCollectionPage buildFromResponse(final SegmentCollectionResponse response) {
        final ISegmentCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new SegmentCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final SegmentCollectionPage page = new SegmentCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
