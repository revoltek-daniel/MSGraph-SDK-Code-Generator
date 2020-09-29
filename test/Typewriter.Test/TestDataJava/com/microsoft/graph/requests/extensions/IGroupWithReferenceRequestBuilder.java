// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Group;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Group With Reference Request Builder.
 */
public interface IGroupWithReferenceRequestBuilder extends IRequestBuilder {

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IGroupWithReferenceRequest instance
     */
    IGroupWithReferenceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IGroupWithReferenceRequest instance
     */
    IGroupWithReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IGroupReferenceRequestBuilder reference();

}
