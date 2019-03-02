/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License;
 * you may not use this file except in compliance with the Elastic License.
 */

package org.elasticsearch.xpack.core.deprecation;

import org.elasticsearch.action.support.nodes.BaseNodesRequest;
import org.elasticsearch.common.io.stream.StreamInput;
import org.elasticsearch.common.io.stream.StreamOutput;

import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

public class NodesDeprecationCheckRequest extends BaseNodesRequest<NodesDeprecationCheckRequest> {
    public NodesDeprecationCheckRequest() {}

    public NodesDeprecationCheckRequest(String... nodesIds) {
        super(nodesIds);
    }

    @Override
    public void readFrom(StreamInput in) throws IOException {
        super.readFrom(in);
    }

    @Override
    public void writeTo(StreamOutput out) throws IOException {
        super.writeTo(out);
    }

    @Override
    public int hashCode() {
        return Objects.hash((Object[]) this.nodesIds());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodesDeprecationCheckRequest that = (NodesDeprecationCheckRequest) obj;
        return Arrays.equals(this.nodesIds(), that.nodesIds());
    }
}
