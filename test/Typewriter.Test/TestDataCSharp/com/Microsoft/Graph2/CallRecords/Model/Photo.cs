// ------------------------------------------------------------------------------
//  Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
// <auto-generated/>

// Template Source: Templates\CSharp\Model\EntityType.cs.tt

namespace Microsoft.Graph2.CallRecords
{
    using System;
    using System.Collections.Generic;
    using System.IO;
    using System.Runtime.Serialization;
    using Newtonsoft.Json;

    /// <summary>
    /// The type Photo.
    /// </summary>
    [JsonObject(MemberSerialization = MemberSerialization.OptIn)]
    public partial class Photo : Microsoft.Graph.Entity
    {
    
		///<summary>
		/// The Photo constructor
		///</summary>
        public Photo()
        {
            this.ODataType = "microsoft.graph2.callRecords.photo";
        }
	
        /// <summary>
        /// Gets or sets failure info.
        /// </summary>
        [JsonProperty(NullValueHandling = NullValueHandling.Ignore, PropertyName = "failureInfo", Required = Newtonsoft.Json.Required.Default)]
        public FailureInfo FailureInfo { get; set; }
    
    }
}

